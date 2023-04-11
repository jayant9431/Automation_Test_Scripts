/*WAP to read multiple data from the excel worksheet*/
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileReadMultipalData93 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int countRow = wb.getSheet("InvalidLogin").getLastRowNum();
		for(int i=1;i<=countRow;i++) {
		String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
		String pw = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
		System.out.println(un+" "+pw);
		}
	}
}
