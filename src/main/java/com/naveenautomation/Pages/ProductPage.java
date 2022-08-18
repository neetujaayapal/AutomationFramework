package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	
	WebDriver driver;

	private WebElement addToCartElement = driver
			.findElement(By.cssSelector("div#content>div:nth-of-type(2)>div:nth-of-type(2) div.button-group span"));

	private WebElement checkOutElement = driver.findElement(By.cssSelector("ul.list-inline>li:nth-of-type(5) span"));

	public void addToCartClick() {

		addToCartElement.click();
	}

	public void checkOutClick() {

		checkOutElement.click();
	}


}
