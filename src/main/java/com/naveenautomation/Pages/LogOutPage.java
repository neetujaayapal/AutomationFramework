package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutPage {
	
	WebDriver driver;
	
	WebElement logmessage =driver.findElement(By.cssSelector("div#content h1"));

	public String getlogoutText() {
		
		return logmessage.getText();
	}

}
