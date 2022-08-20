package com.naveenautomation.Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

	WebDriver driver;

	String ranEmail;

	WebElement firstNameInputField = driver.findElement(By.cssSelector("fieldset#account>div:nth-of-type(2) input"));

	WebElement lastNameInputField = driver.findElement(By.cssSelector("fieldset#account>div:nth-of-type(3) input"));

	WebElement emailInputField = driver.findElement(By.cssSelector("fieldset#account>div:nth-of-type(4) input"));

	WebElement telephoneInputField = driver.findElement(By.cssSelector("fieldset#account>div:nth-of-type(5) input"));

	WebElement passwordInputField = driver
			.findElement(By.cssSelector("div#content form fieldset:nth-of-type(2)>div:nth-of-type(1) input"));

	WebElement confirmPasswordInputField = driver
			.findElement(By.cssSelector("div#content form fieldset:nth-of-type(2)>div:nth-of-type(2) input"));

	WebElement agreeButton = driver.findElement(By.cssSelector("div.buttons input:nth-of-type(1)"));

	WebElement submitButton = driver.findElement(By.cssSelector("div.buttons input:nth-of-type(2)"));

	public String randomMethod() {

		Random rnd = new Random();

		int ranNumber = rnd.nextInt(1000);
		ranEmail = "name" + ranNumber + "@gmail.com";
		
		return ranEmail;

	}

	public void firstNamesendKeys(String name) {

		firstNameInputField.sendKeys(name);

	}

	public void lastNamesendKeys(String name) {

		lastNameInputField.sendKeys(name);

	}

	public void emailsendKeys(String name) {

		emailInputField.sendKeys(name);

	}

	public void telephonesendKeys(String name) {

		telephoneInputField.sendKeys(name);

	}

	public void passwordsendKeys(String name) {

		passwordInputField.sendKeys(name);

	}

	public void confirmPasswordsendKeys(String name) {

		confirmPasswordInputField.sendKeys(name);

	}

	public void agreeButtonsubmit() {

		agreeButton.submit();

	}

	public void submitButtonclick() {

		submitButton.click();

	}
}
