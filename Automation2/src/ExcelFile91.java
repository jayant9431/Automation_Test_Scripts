/*WAS  to login into actitime by taking the data from the excel file*/
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFile91 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	//	get the java representative object of the physical file	
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
	//	open or create the workbook
		Workbook wb = WorkbookFactory.create(fis);
	//	taking the value of URL username password in variables first
		String Url = wb.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
		String un = wb.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
		String pwd = wb.getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();
		
	//	now using variable to open the actitime account 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(Url);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
