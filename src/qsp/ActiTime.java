package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		int x1 = driver.findElement(By.xpath("//input[@id='username']")).getLocation().getX();
		int x2 = driver.findElement(By.xpath("//input[@name='pwd']")).getLocation().getX();
		if(x1==x2) {
			System.out.println("properlyalligned");
		}
		else {
			System.out.println("notalligned");
		}
		int h1 = driver.findElement(By.xpath("//input[@id='username']")).getSize().getHeight();
		int h2 = driver.findElement(By.xpath("//input[@name='pwd']")).getSize().getWidth();
		int w1 = driver.findElement(By.xpath("//input[@id='username']")).getSize().getWidth();
		int w2 = driver.findElement(By.xpath("//input[@name='pwd']")).getSize().getWidth();
		
		if(h1==h2 && w1==w2) {
			System.out.println("same h&w");
		}
		else {
			System.out.println("not same h&w");
		}
	}
	
}
