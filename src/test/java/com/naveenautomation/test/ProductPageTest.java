package com.naveenautomation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.naveenautomation.Pages.ProductPage;

public class ProductPageTest {

	ProductPage test1 = new ProductPage();
	
	public void addToCartTest() {
		
		test1.addToCartClick();
	}
	
	public void checkOutTest() {
		test1.checkOutClick();
	}

}
