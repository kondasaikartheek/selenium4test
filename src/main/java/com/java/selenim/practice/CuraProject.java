package com.java.selenim.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CuraProject {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Konda\\Downloads\\Drivers\\chrome.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		WebElement makeanappointment = driver.findElement(By.id("btn-make-appointment"));
		makeanappointment.click();
		
		WebElement uname = driver.findElement(By.id("txt-username"));
		uname.sendKeys("John Doe");
		
		WebElement password = driver.findElement(By.id("txt-password"));
		password.sendKeys("ThisIsNotAPassword");
	
		WebElement submit = driver.findElement(By.id("btn-login"));
		submit.click();
		
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
		
		WebElement bookappointment = driver.findElement(By.id("btn-book-appointment"));
		bookappointment.click();
		
		WebElement gotohome = driver.findElement(By.xpath("//*[text()='Go to Homepage']"));
		gotohome.click();
		
	}

}
