/*WAP to write data to excel*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileWrite92 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//	get the java representative object of the physical file
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
	//	open or create the workbook
		Workbook wb = WorkbookFactory.create(fis);
	//	remember we can write the data Null value should not present in our cell 
	//	because by default null vlue is present in the excel cell
		wb.getSheet("Sheet3").getRow(9).getCell(9).setCellValue("Fail");	
	//	get the java representative object of the physical file
		FileOutputStream fos=new FileOutputStream("./data/TestScript.xlsx");
	//	save the workbook (actual writing happen here)
		wb.write(fos);
		
		wb.close();
	}
}
