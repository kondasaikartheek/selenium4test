package com.practise.selenium.stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import io.cucumber.java.en.*;

public class curve {
	
//	public curve() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Konda\\eclipse-workspace22\\Testing\\src\\main\\resources\\Drivers\\chrome.exe");
//		
//	}
		
	WebDriver driver;
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	
	@Given("User is on loginpage")
	public void user_is_on_loginpage() {
		driver = new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/673/identity/login");
	   
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("standard_user");
	}

	@And("clicks on Login Button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("users navigated to Home page")
	public void users_navigated_to_home_page() {
		Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0);
	  
	}

	@And("close the browser")
	public void close_the_browser() {
	   driver.close();
	}


}



