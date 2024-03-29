package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingPropertyFile {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("pasword");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	
	
}
