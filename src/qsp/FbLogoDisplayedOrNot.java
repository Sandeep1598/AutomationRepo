package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogoDisplayedOrNot {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean img = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		if(img) {
			System.out.println("displyaed");
		}
		else {
			System.out.println("not displyed");
		}
		driver.close();
}}
