/*WAP to read the data from excel file*/
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile90 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//	get the java representative object of the physical file
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");	
	//	here we are doing upcasting and "create" is static method in WorkbookFactory class
	//	open or create the workbook
		Workbook wb = WorkbookFactory.create(fis);
	//	get the control of the sheet, get the control of row then cell then get or read the data.
		String data = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(data);
	}
}
