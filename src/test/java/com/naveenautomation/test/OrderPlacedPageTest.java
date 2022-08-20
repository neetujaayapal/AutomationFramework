package com.naveenautomation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.naveenautomation.Pages.OrderPlacedPage;

public class OrderPlacedPageTest {
	
	OrderPlacedPage test1 = new OrderPlacedPage();
	
	public void orderPlacedTextField() {
		test1.orderPlacedText();
	}
	
	public void accountButtonTest() {
		test1.accountclick();
	}
	
	public void logButtonTest() {
		test1.logclick();
	}
	
	
	
	

}
