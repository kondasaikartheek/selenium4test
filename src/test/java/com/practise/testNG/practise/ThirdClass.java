package com.practise.testNG.practise;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ThirdClass extends TestHelper {
	
	@Test
	public void methodOne(){




		WebElement uname = driver.findElement(By.id("name"));
		uname.sendKeys("John");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("John0gmail.com");
		
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("123456789");
		
		WebElement textarea = driver.findElement(By.id("textarea"));
		textarea.sendKeys("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
	
		WebElement radio = driver.findElement(By.id("male"));
		radio.click();
		
		WebElement checkbox = driver.findElement(By.id("monday"));
		checkbox.click();
		
		WebElement CountryDropdown = driver.findElement(By.id("country"));
		Select S1=new Select(CountryDropdown);
		S1.selectByVisibleText("India");
		WebElement colour = driver.findElement(By.id("colors"));
		Select S2=new Select(colour);
		S2.selectByVisibleText("Yellow");
		
		
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("07/11/1996");
		
		WebElement checkboxtable = driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[2]/td[4]/input"));
		checkboxtable.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
		
		//window handle
//		JavascriptExecutor jss = (JavascriptExecutor) driver;
//		jss.executeScript("window.scrollBy(0,350)", "");
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
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,350)", "");
		
		WebElement Prompt = driver.findElement(By.xpath("//*[text()='Prompt']"));
		Prompt.click();
		Alert confirmationnn = driver.switchTo().alert();
		confirmation.sendKeys("kartheek");
		String alerttextt = confirmationnn.getText();
		System.out.println(alerttextt);
		driver.switchTo().alert().accept();
		//confirmationnn.accept();//confirmationn.dismiss();
		

		
		//doubleClick
		WebElement element = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
		
		//Dragged and dropped.	
		WebElement From=driver.findElement(By.id("draggable"));	
       WebElement To=driver.findElement(By.id("droppable"));					
       Actions act=new Actions(driver);					
       act.dragAndDrop(From, To).build().perform();	

	

       //frame
       WebElement frame = driver.findElement(By.id("frame-one796456169"));
       driver.switchTo().frame(frame);
       WebElement fname = driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-0\"]"));
       fname.sendKeys("kk");
       
       WebElement checkbox1 = driver.findElement(By.xpath("//*[contains(@for,'RESULT_RadioButton-1_0')]"));
		checkbox1.click();
       
		WebElement date1 = driver.findElement(By.xpath("//*[contains(@class,'text_field calendar_field hasDatepicker')]"));
		date1.sendKeys("07/11/1996");
		
		
		WebElement job = driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-3\"]"));
		Select s2=new Select(job);
		s2.selectByVisibleText("Developer");
	
		
		 WebElement submit = driver.findElement(By.xpath("//*[@id=\"FSsubmit\"]"));
		 submit.click();
		
		 driver.switchTo().defaultContent();
    
       
      
      
	}


}
