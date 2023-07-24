package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/")){
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.close();
	}

}
