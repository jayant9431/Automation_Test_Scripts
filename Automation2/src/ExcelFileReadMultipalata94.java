/*WAP to read multiple data from the excel worksheet
 * code is optimized than previous code*/
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileReadMultipalata94 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int countRow = wb.getSheet("InvalidLogin").getLastRowNum();
		short countColumn = wb.getSheet("InvalidLogin").getRow(0).getLastCellNum();
		
		for(int i=1;i<=countRow;i++)
		{
			for(int j=0;j<countColumn;j++)	// REMEMBER THIS CODE
			{
				String UnPwd = wb.getSheet("InvalidLogin").getRow(i).getCell(j).getStringCellValue();
				System.out.println(UnPwd);
			}
		}	
	}
}
