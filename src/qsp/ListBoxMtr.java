package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxMtr {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/hotel.html");
		WebElement cpbx = driver.findElement(By.id("mtr"));
		Select s=new Select(cpbx);
		
		
		int count = s.getOptions().size();
		for(int i=0;i<count;i++) {
			s.selectByIndex(i);
		}
		for(int i=count-1;i>=0;i--)
		{
			s.deselectByIndex(i);
		}
		
		driver.close()
;}}
