package com.naveenautomation.test;

import com.naveenautomation.Pages.CheckOutPage;

public class CheckOutPageTest {
	
	CheckOutPage test1 = new CheckOutPage();
	
	public void nameTest() {
		
		test1.nameSendKeys("Neetu");
	}
	
	public void addressTest() {
		
		test1.addressSendKeys("Mcmurchy");
	}
	
	public void placetest() {
		
		test1.placeSendKeys("Brampton");
	}
	
	public void postalCodeTest () {
		
		test1.postalCodeSendKeys("L6X 1X7");
	}
	
//	public void countrytest() {
//		test1.selectCountry("");
//	}
	
//	public void provincetest() {
//		
//	}
	
	public void billindetailButtonTest() {
		
		test1.billingdetailclick();
	}
	
	public void deliveryDetailClick() {
		
		test1.deliverydetailclick();
	}
	
	public void deliveryMethodClick() {
		test1.deliveryMethodclick();
	}
	
	public void paymentClick() {
		test1.paymentclick();
	}
	
	public void paymentSubmitTest() {
		test1.paymentsubmitclick();
	}
	
	public void confirmOrderClick() {
		
		test1.confirmOrderclick();
	}

}
