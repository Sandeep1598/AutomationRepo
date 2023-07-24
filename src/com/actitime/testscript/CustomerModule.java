package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class CustomerModule extends BaseClass{
@Test
public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	FileLib f=new FileLib();
	String cName = f.getExcelData("CreateCustomer", 1, 1);
	String cDesc = f.getExcelData("CreateCustomer", 1, 4);
	HomePage h=new HomePage(driver);
     h.setTaskTab();
TaskListPage t=new TaskListPage(driver);
t.getAddCustomer().click();
t.getCreateNewCust().click();
t.getEnterCustName().sendKeys(cName);
t.getEnterCustDesc().sendKeys(cDesc);
t.getSelectCust().click();
t.getSelectOurCompany().click();
t.getCreateCust().click();
Thread.sleep(4000);
String aName = t.getCustName().getText();
Assert.assertEquals(cName, aName);

}
}