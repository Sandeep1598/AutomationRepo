package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is the Generic class for data driven testing
 * @author sandeep
 *
 */
public class FileLib {
	/**
	 * This is a generic method for reading the data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */

public String getProperty(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	
	Properties p=new Properties();
	p.load(fis);
	
	String data = p.getProperty(key);
	return data;
	
}
/**
 * This is a generic method for reading the data from EXCEL file
 * @param sheetname
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String getExcelData(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException{
	FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	 String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return data;	
}
/**
 * This is a generic method for writing the data to EXCEL file
 * @param sheetname
 * @param row
 * @param cell
 * @param value
 * @throws EncryptedDocumentException
 * @throws IOException
 */



public void setExcelData(String sheetname, int row, int cell, Date value) throws EncryptedDocumentException, IOException {
	
FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	
	 wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
	 
	 FileOutputStream fos=new FileOutputStream("./data/TestScript.xlsx");
	 wb.write(fos);
	 wb.close();
	
	
}

}

