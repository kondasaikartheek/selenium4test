package com.practise.testNG.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondClass extends TestHelper{


	@Test
	public void amethodTwo() {
		
		System.out.println("I am from method Two 01");

		
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
