package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxFb {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 WebElement mnth = driver.findElement(By.xpath("//select[@id='month']"));
		 Select s=new Select(mnth);
		 s.selectByIndex(1);
		 Thread.sleep(3000);
		 s.selectByValue("5");
		 Thread.sleep(3000);
		 s.selectByVisibleText("Jun");
		 Thread.sleep(3000);
		
		 driver.close();
		 
		 
}}
