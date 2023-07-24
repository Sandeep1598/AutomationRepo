package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Verify {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test(groups="sk")
	public void verifyTitle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle="Google";
		String aTitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(eTitle,aTitle);
		driver.close();
		s.assertAll();
	}
}
