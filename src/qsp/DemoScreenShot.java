package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoScreenShot {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void scrn() throws IOException{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot t=(TakesScreenshot) driver;
	     File src = t.getScreenshotAs(OutputType.FILE);
	     File dest=new File("./screenshot/ss.png");
	     FileUtils.copyFile(src, dest);driver.close();	
	}
	
}
