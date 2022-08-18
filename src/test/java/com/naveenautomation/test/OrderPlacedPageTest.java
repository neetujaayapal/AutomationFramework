package com.naveenautomation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPlacedPageTest {
	
	WebDriver driver;
	
	WebElement accountElement =driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:nth-of-type(5) a"));

	WebElement logOutMessageElement = driver.findElement(By.cssSelector("div#content h1"));

}
