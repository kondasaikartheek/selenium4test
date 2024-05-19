package com.practise.selenium.stepdefinitions;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.en.*;



public class BTproject {

	WebDriver driver;

	@Given("user navigate to url")
	public void user_navigate_to_url() {
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@When("user enters name as {string}")
	public void user_enters_name(String name) {
		WebElement uname = driver.findElement(By.id("name"));
		uname.sendKeys(name);
	}

	@And("user enters email as {string}")
	public void user_enters_email(String string) {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(string);
	}

	@And("user enters phone {string}")
	public void user_enters_phone(String string) {
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys(string);
	}

	@And("user enters address {string}")
	public void user_enters_address(String string) {
		WebElement textarea = driver.findElement(By.id("textarea"));
		textarea.sendKeys(string);
	
	}

	@And("user click gender")
	public void user_click_gender() {
		WebElement radio = driver.findElement(By.id("male"));
		radio.click();
	}

	@And("user select days")
	public void user_select_days() {
		WebElement checkbox = driver.findElement(By.id("monday"));
		checkbox.click();
	}
	

	@And("user selects Country {string}")
	public void user_selects_country_india(String string) {
		
		WebElement CountryDropdown = driver.findElement(By.id("country"));
		Select S1=new Select(CountryDropdown);
		S1.selectByVisibleText(string);
		
	}

	@Then("user selects colour {string}")
	public void user_selects_colour(String string) {
		WebElement colour = driver.findElement(By.id("colors"));
		Select S2=new Select(colour);
		S2.selectByVisibleText(string);
	}

	@And("user selects date {string}")
	public void user_selects_date(String string) {
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys(string);
	}

	@And("user selects product")
	public void user_selects_product() {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,350)", "");
		WebElement checkboxtable = driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[2]/td[4]/input"));
		checkboxtable.click();
	}
	
	@Then("user selects window")
	public void user_selects_window() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
		
		String mainWindow=driver.getWindowHandle();

		driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button")).click();
		
		Set<String>allWindows=driver.getWindowHandles();
		
		
		for(String childWindow:allWindows ) {
			if(!childWindow.equals(mainWindow)) {
				driver.switchTo().window(childWindow);

//				driver.navigate().back();
				driver.close();
//				driver.quit();
				}	
		}
		 driver.switchTo().window(mainWindow);
		
	}

	@And("user selects Alert ConfirmBox Prompt")
	public void user_selects_alert_confirm_box_prompt() {
		
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,-350)", "");
		//Alert
		
				WebElement alert = driver.findElement(By.xpath("//*[text()='Alert']"));
				alert.click();
				Alert confirmation = driver.switchTo().alert();
				String alerttext = confirmation.getText();
				System.out.println(alerttext);
				confirmation.accept();

			
		//confirmBox
				WebElement confirmBox = driver.findElement(By.xpath("//*[text()='Confirm Box']"));
				confirmBox.click();
				Alert confirmationn = driver.switchTo().alert();
				
				confirmationn.accept();//confirmationn.dismiss();
				 
		//Prompt
//				JavascriptExecutor jss = (JavascriptExecutor) driver;
//				jss.executeScript("window.scrollBy(0,350)", "");
				
				WebElement Prompt = driver.findElement(By.xpath("//*[text()='Prompt']"));
				Prompt.click();
				Alert confirmationnn = driver.switchTo().alert();
				confirmation.sendKeys("kartheek");
				String alerttextt = confirmationnn.getText();
				System.out.println(alerttextt);
				driver.switchTo().alert().accept();
				//confirmationnn.accept();//confirmationn.dismiss();
				

	}

	@And("user Double Click")
	public void user_double_click() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	@Then("user Drag and drop the box")
	public void user_drag_and_drop_the_box() {
		WebElement From=driver.findElement(By.id("draggable"));	
	       WebElement To=driver.findElement(By.id("droppable"));					
	       Actions act=new Actions(driver);					
	       act.dragAndDrop(From, To).build().perform();	

	}

	@Then("user eneters into Frames")
	public void user_eneters_into_frames() {
		  WebElement frame = driver.findElement(By.id("frame-one796456169"));
	       driver.switchTo().frame(frame);
	}

	@And("user enters framename")
	public void user_enters_framename() {
		  WebElement fname = driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-0\"]"));
	       fname.sendKeys("kk");
	}

	@And("user enters Gender")
	public void user_enters_gender() {
		  WebElement checkbox1 = driver.findElement(By.xpath("//*[contains(@for,'RESULT_RadioButton-1_0')]"));
			checkbox1.click();
	}

	@And("user enters Dob")
	public void user_enters_dob() {
		WebElement date1 = driver.findElement(By.xpath("//*[contains(@class,'text_field calendar_field hasDatepicker')]"));
		date1.sendKeys("07/11/1996");
	}

	@And("user enters Job")
	public void user_enters_job() {
		WebElement job = driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-3\"]"));
		Select s2=new Select(job);
		s2.selectByVisibleText("Developer");
	
		
		 WebElement submit = driver.findElement(By.xpath("//*[@id=\"FSsubmit\"]"));
		 submit.click();
		
		 driver.switchTo().defaultContent();
	}


	
	
	
}
