package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinhexceldata {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("act").getRow(0).getCell(1).getStringCellValue();
		String un = wb.getSheet("act").getRow(1).getCell(1).getStringCellValue();
		String pwd = wb.getSheet("act").getRow(2).getCell(1).getStringCellValue();
		
		
		
WebDriver driver=new ChromeDriver();
		
		
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		wb.getSheet("act").getRow(2).getCell(0).setCellValue("myname");
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
}}
