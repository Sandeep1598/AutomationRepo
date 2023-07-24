package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath="//input[@id='username']")
private WebElement untbx;
@FindBy(xpath="//input[@name='pwd']")
private WebElement pwtbx;
@FindBy(xpath="//div[text()='Login ']")
private WebElement lgbtn;


 public LoginPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 

}
public void setLogin(CharSequence un, CharSequence pwd) {
	untbx.sendKeys(un);
	pwtbx.sendKeys(pwd);
	lgbtn.click();
}


}
