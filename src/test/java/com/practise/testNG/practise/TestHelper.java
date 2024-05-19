package com.practise.testNG.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestHelper {
	ChromeDriver driver ;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am from before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am from after suite");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("I am from before class ");
		
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am from after class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am from before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am from after Test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am from beforeMethoder Test");
		 driver = new ChromeDriver(); 
//		 driver = new ChromeDriver(); 
//		 driver.get("https://katalon-demo-cura.herokuapp.com/");
//			WebElement makeanappointment = driver.findElement(By.id("btn-make-appointment"));
//			makeanappointment.click();
//			
//			WebElement uname = driver.findElement(By.id("txt-username"));
//			uname.sendKeys("John Doe");
//			
//			WebElement password = driver.findElement(By.id("txt-password"));
//			password.sendKeys("ThisIsNotAPassword");
//		
//			WebElement submit = driver.findElement(By.id("btn-login"));
//			submit.click();
			
			
		 driver.get("https://testautomationpractice.blogspot.com/");
			
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am from afterMethod Test");
	}
}
