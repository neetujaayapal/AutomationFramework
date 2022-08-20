package com.naveenautomation.test;

import com.naveenautomation.Pages.LoginPage;

public class LoginPageTest {

	LoginPage test1 = new LoginPage();

	public void emailInputField() {

		test1.emailSendKeys(test1.randomMethod());
	}

	public void passwordInputField() {

		test1.passwordSendKeys("Naveenlab");
	}

	public void loginButtonField() {

		test1.loginClick();
	}

}
