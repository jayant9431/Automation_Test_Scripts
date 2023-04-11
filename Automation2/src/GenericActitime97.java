/*WAS to login to actitime.com by taking the data from the property file with
 * the help of generic library*/
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericActitime97 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		GenericLibrary95 gl=new GenericLibrary95();
		String url = gl.getExcelData("Sheet2", 1, 0);
		String un = gl.getExcelData("Sheet2", 1, 1);
		String pwd = gl.getExcelData("Sheet2", 1, 2);
		System.out.println("URL for website : "+url);
		System.out.println("Username : "+un);
		System.out.println("Password : "+pwd);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();	
		
		driver.close();
	}
}
