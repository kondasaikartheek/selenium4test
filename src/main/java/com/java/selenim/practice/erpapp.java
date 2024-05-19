package com.java.selenim.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erpapp {
	
	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://erpapp.in/real_estate_new/");
		

		
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("1234");
		WebElement pname = driver.findElement(By.name("password"));
		pname.sendKeys("1234");
		
		WebElement signIn = driver.findElement(By.name("submit"));
		signIn.click();
	}

}
