package com.naveenautomation.test;

import com.naveenautomation.Pages.RegisterPage;

public class RegisterPageTest {
	
	RegisterPage test2 = new RegisterPage();
	
	public void firstNameFieldTest() {
		
		test2.firstNamesendKeys("Neetu");
	}
	
	public void lastNameFieldTest() {
		test2.lastNamesendKeys("Jayapalan");
	}
	
	public void emailFieldTest() {
		
		test2.emailsendKeys(test2.randomMethod());
		
	}
	
	public void telephoneInputField() {
		
		test2.telephonesendKeys("12456546546");
	}

	public void passwordInputField() {
		test2.passwordsendKeys("Naveenlab");
	}
	
	public void confirmPasswordField() {
		
		test2.confirmPasswordsendKeys("Naveenlab");
	}
	
	public void agreeButtonField() {
		
		test2.agreeButtonsubmit();
	}
	
	public void submitFieldButton() {
		test2.submitButtonclick();
	}
}
