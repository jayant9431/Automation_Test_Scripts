package com.actitime.generic;

/*This is generic Library for getting the data from Property file and Excel File
 *and reading the data from Excel file*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BaseClassGenericLibrary9 {

	/**
	 * this is generic method for reading the data from Property file
	 * @author JAYANT
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/PropertiFile.txt");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	/**
	 * this is a generic method for reading the data from excel file
	 * @author JAYANT
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	/**
	 * this is a generic method for writing the data to excel file
	 * @author JAYANT
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelData(String sheetName,int row, int cell, String value) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
		
		FileOutputStream fos= new FileOutputStream("./data/TestScript.xlsx");
		wb.write(fos);
		wb.close();
	}	
}