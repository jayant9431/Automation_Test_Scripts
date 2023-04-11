/*Automate the following scenario
 * S1: go to vtiger.com
 * S2: mouse hover to "resources" tab
 * S3: Click on "contact us" in drop down menu
 * S4: capture the "Bangaluru India" phone no and print it on the console*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction77 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://vtiger.com/");
		
		WebElement resources = driver.findElement(By.partialLinkText("Resources"));
		
	//	Actions class will take the cursor control as we pass the driver as argument
		Actions a=new Actions(driver);
	//	now cursor control move to "resources" tab y the help of moveToElement() method
		a.moveToElement(resources).perform();	// perform() is compulsory here
		
		driver.findElement(By.partialLinkText("Contact Us")).click();
String phoneNo = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/..//p[2] ")).getText();
		
		System.out.println(phoneNo);
		
		driver.close();
	}

}
