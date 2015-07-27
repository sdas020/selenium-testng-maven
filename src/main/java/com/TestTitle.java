package com;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestTitle {
	private WebDriver driver = null;
	public String URL = "http://www.nguoianphu.com/user/login";

	@Test
	public void testEasy() {
		driver.get(URL);
		String title = driver.getTitle();
		// AssertJUnit.assertTrue(title.contains("Home page Nguoi An Phu huyen An Phu tinh An Giang"));
		Assert
				.assertTrue(title
						.contains("User login Nguoi An Phu huyen An Phu tinh An Giang"));
	}

	@BeforeTest
	public void beforeTest() throws Exception {
		driver = new FirefoxDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
