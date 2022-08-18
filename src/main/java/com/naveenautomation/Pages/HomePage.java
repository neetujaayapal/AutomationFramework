package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	private WebElement myAccountButton = driver.findElement(By.cssSelector("ul.list-inline li.dropdown a"));
	
	private WebElement registerButton = driver.findElement(By.cssSelector("ul.list-inline li.dropdown ul li:nth-of-type(1) a"));

	
	public void clickMyAccountButton() {
		
		myAccountButton.click();
	}
	
       public void clickRegisterButton() {
		
		registerButton.click();
	}
	
	
}
