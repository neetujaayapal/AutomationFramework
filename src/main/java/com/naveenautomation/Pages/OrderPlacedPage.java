package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPlacedPage {
	
	WebDriver driver;
	
	WebElement orderPlaced = driver.findElement(By.cssSelector("ul.list-inline li.dropdown span:nth-of-type(1)"));
	
	WebElement accountElement =driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:nth-of-type(5) a"));

	WebElement logOutMessageElement = driver.findElement(By.cssSelector("div#content h1"));
	
	public String orderPlacedText() {
		
	return	orderPlaced.getText();
	}
	
	
	public void accountclick() {
		accountElement.click();
	}
	

	public void logclick() {
		logOutMessageElement.click();
	}


}
