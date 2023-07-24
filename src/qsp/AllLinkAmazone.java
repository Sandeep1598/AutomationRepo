package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkAmazone {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> alllink = driver.findElements(By.xpath("//a"));
		int count = alllink.size();
		
		for(int i=1;i<count;i++) {
			String text = alllink.get(i).getText();
			System.out.println(text);
		}
	
	driver.close();
}}
