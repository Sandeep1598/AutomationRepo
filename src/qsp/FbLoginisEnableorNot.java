package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginisEnableorNot {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean ena = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		if(ena) {
			System.out.println("enabled");
		}
		else {
			System.out.println("not");
		}
		driver.close();
	}
	
}
