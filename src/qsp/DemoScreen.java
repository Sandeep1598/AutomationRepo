package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoScreen {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	
@Test
	
	public void DemoScreen() throws Throwable {
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.naukri.com/");
	
	TakesScreenshot t=(TakesScreenshot) driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	
	File f=new File("./screenshot/ssk.png");
	
	FileUtils.copyFile(src, f);
	}

}
