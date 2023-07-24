package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("(//span[@class='css-zneog5 e1wnkr790'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='css-zneog5 e1wnkr790'])[1]")).click();
		Set<String> allwh = driver.getWindowHandles();
		
		int count = allwh.size();
		System.out.println(count);
		for(String wh:allwh) {
			driver.switchTo().window(wh);
		String title = driver.getTitle();
		System.out.println(title);
		
		}
		driver.close();
		
}}

