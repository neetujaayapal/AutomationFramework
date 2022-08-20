package com.naveenautomation.Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {

	WebDriver driver;

	String ranEmail;

	Actions ac = new Actions(driver);

	WebElement email = driver.findElement(By.cssSelector(
			"div#account-login div#content>div>div:nth-of-type(2) div.well form div:nth-of-type(1) input"));

	WebElement password = driver.findElement(By.cssSelector(
			"div#account-login div#content>div>div:nth-of-type(2) div.well form div:nth-of-type(2) input"));

	WebElement loginBtnField = driver
			.findElement(By.cssSelector("div#account-login div#content>div>div:nth-of-type(2) div.well form>input"));

	public String randomMethod() {

		Random rnd = new Random();

		int ranNumber = rnd.nextInt(1000);
		ranEmail = "name" + ranNumber + "@gmail.com";
		
		return ranEmail;

	}

	public void emailSendKeys(String name) {

		email.sendKeys(name);
	}

	public void passwordSendKeys(String name) {

		password.sendKeys(name);
	}

	public void loginClick() {

		loginBtnField.click();

	}

}
