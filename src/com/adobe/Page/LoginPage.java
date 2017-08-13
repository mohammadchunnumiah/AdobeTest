package com.adobe.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//to initialize webdriver
	WebDriver driver;

	By username = By.cssSelector("#adobeid_username");
	By password = By.cssSelector("#adobeid_password");
	By signinbutton = By.cssSelector("#sign_in");

	//constructor created
	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	public void loginToAdobe(String userid, String pword) {
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pword);
		driver.findElement(signinbutton).click();

	}

	public void enterUserID(String userid) {
		driver.findElement(username).sendKeys(userid);

	}

	public void enterPassword(String pword) {
		driver.findElement(password).sendKeys(pword);
	}

	public void clickOnSignInButton() {
		driver.findElement(signinbutton).click();
	}

}
