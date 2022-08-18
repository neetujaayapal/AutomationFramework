package com.naveenautomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {

	WebDriver driver;

	WebElement name = driver.findElement(By.cssSelector("#input-payment-lastname"));

	WebElement address = driver.findElement(By.cssSelector("#input-payment-address-1"));

	WebElement place = driver.findElement(By.cssSelector("#input-payment-city"));

	WebElement postalCode = driver.findElement(By.cssSelector("#input-payment-postcode"));

	WebElement country = driver.findElement(By.cssSelector("#input-payment-country"));

	WebElement province = driver.findElement(By.cssSelector("#input-payment-zone"));

	WebElement billingdetail = driver.findElement(By.cssSelector("div.buttons.clearfix input"));

	WebElement deliverydetail = driver.findElement(By.cssSelector("input#button-shipping-address"));

	WebElement deliveryMethod = driver.findElement(By.cssSelector("input#button-shipping-method"));

	WebElement paymentClick = driver.findElement(By.cssSelector(
			"div.panel-group>div:nth-of-type(5)>div:nth-of-type(2)>div>div.buttons div.pull-right input:nth-of-type(1)"));

	WebElement paymentSubmit = driver.findElement(By.cssSelector(
			"div.panel-group>div:nth-of-type(5)>div:nth-of-type(2)>div>div.buttons div.pull-right input:nth-of-type(2)"));

	WebElement confirmOrder = driver
			.findElement(By.cssSelector("div#collapse-checkout-confirm div.panel-body>div:nth-of-type(2) input"));

	public void nameSendKeys(String names) {

		name.sendKeys(names);
	}

	public void addressSendKeys(String names) {

		address.sendKeys(names);
	}

	public void placeSendKeys(String names) {

		place.sendKeys(names);
	}

	public void billingdetailclick() {

		billingdetail.click();
	}

	public void deliverydetailclick() {

		deliverydetail.click();
	}

	public void deliveryMethodclick() {

		deliveryMethod.click();
	}

	public void paymentclick() {

		paymentClick.click();
	}

	public void paymentsubmitclick() {

		paymentSubmit.click();
	}

	public void confirmOrderclick() {

		confirmOrder.click();
	}

	public void selectCountry(WebElement country) {
		select(country).selectByVisibleText("Canada");

	}

	public void selectProvince(WebElement country) {
		select(province).selectByVisibleText("Ontario");

	}

	public Select select(WebElement element) {

		Select sc = new Select(element);

		return sc;

	}

}
