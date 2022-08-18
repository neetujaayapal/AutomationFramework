package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountCreatedPage {
	
	WebDriver driver;
	
	private WebElement accountAlertText = driver.findElement(By.cssSelector("div#content h1"));
			
		
	public String getAccountText() {
		
		return accountAlertText.getText();
	}

}
