/*WAS to understand the concept of File upload pop up and 
 * how to give absolute path and generic path*/
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload57 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	//	getting the URL of html file
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/uploadResume.html");
		
		Thread.sleep(2000);
		
	//	giving relative path bcz File class will only take relative path
		File f=new File("./data/TestingExperiencedResume.docx");
		
	//	converting relative path to absolute path
		String absolutePath = f.getAbsolutePath();
		
	//	send absolute path to sendKeys() method bcz it only take absolute path 
		driver.findElement(By.id("cv")).sendKeys(absolutePath);
		Thread.sleep(1000);
		driver.close();

	}

}
