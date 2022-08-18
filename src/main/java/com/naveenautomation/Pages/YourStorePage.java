package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourStorePage {
	
	WebDriver driver;
	
	private WebElement product = driver.findElement(By.cssSelector("ul.nav.navbar-nav>li:nth-of-type(6) a"));

	
	public void productClick() {
		
		product.click();
	}

}
