package com.practise.selenium.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;



public class CuraTest {
	ChromeDriver driver = new ChromeDriver(); 
	
	@Given("user navigate to main url")
	public void user_navigate_to_main_url() {
	driver.get("https://katalon-demo-cura.herokuapp.com/");
	}

	@When("user book an appointment")
	public void user_book_an_appointment() {
		WebElement makeanappointment = driver.findElement(By.id("btn-make-appointment"));
		makeanappointment.click();
	}

	@And("User enters dubulicate valid username and password {string} and {string}")
	public void user_enters_dubulicate_valid_username_and_password(String string, String string2) {
		WebElement uname = driver.findElement(By.id("txt-username"));
		uname.sendKeys(string);
		
		WebElement password = driver.findElement(By.id("txt-password"));
		password.sendKeys(string2);
	}

	@Then("user click on login")
	public void user_click_on_login() {
		WebElement submit = driver.findElement(By.id("btn-login"));
		submit.click();
	}

	@And("user fill all details")
	public void user_fill_all_details() {
		WebElement FacilityDropdown = driver.findElement(By.id("combo_facility"));
		Select S1=new Select(FacilityDropdown);
		S1.selectByVisibleText("Hongkong CURA Healthcare Center");
		
		
		WebElement checkbox = driver.findElement(By.id("chk_hospotal_readmission"));
		checkbox.click();
		
		WebElement radio = driver.findElement(By.id("radio_program_medicaid"));
		radio.click();
		
		WebElement date = driver.findElement(By.id("txt_visit_date"));
		date.sendKeys("07/11/1996");
		
		WebElement comments = driver.findElement(By.id("txt_comment"));
		comments.sendKeys("can you please call me confim me aboutmy appoint");
	}

	@And("user click on book appointment")
	public void user_click_on_book_appointment() {
		WebElement bookappointment = driver.findElement(By.id("btn-book-appointment"));
		bookappointment.click();
	}

	@Then("user return to home page")
	public void user_return_to_home_page() {
		WebElement gotohome = driver.findElement(By.xpath("//*[text()='Go to Homepage']"));
		gotohome.click();
	}




}
