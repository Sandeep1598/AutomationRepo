package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeISselected {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		boolean slct = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		if(slct) {
		 System.out.println("slcted");
		}
		else {
			System.out.println("not select");
		}
	String text = driver.findElement(By.partialLinkText("Forgot your password?")).getAttribute("href");
	System.out.println(text);
	}}

