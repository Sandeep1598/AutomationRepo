package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/cv.html");
		File f=new File("C:\\Users\\Admin\\Desktop\\Resume");
		String abs = f.getAbsolutePath();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='cv']")).sendKeys(abs);
		
		}}
