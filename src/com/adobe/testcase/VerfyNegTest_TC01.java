package com.adobe.testcase;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adobe.Page.LoginPage;

public class VerfyNegTest_TC01 {

	@Test
	public void verifyInvalidLogin1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Miah\\IdeaProjects\\AdobeAAM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///E:/Adobe/AAM-login-page.html");
		driver.manage().window().maximize();

		LoginPage login = new LoginPage(driver);
		login.enterUserID("matt@");
		login.enterPassword("not");
		login.clickOnSignInButton();

		Thread.sleep(5000);
		driver.quit();
	}

}

//Expected: Enter a valid email address and The password is too short
//Actual: As expected