/*Automate the following scenario
 * S1: go to vtiger.com
 * S2: mouse hover to resource
 * S3: click on customer in the drop down menu
 * S4: double click on login by using method "doubleClick()"
 * S5: verify login pages displayed or not*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDubleClick81 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//	find Resources 
		driver.get("https://vtiger.com/");
		WebElement resources = driver.findElement(By.partialLinkText("Resources"));
	//	hover to Resources and click on Customers
		Actions a=new Actions(driver); 
		a.moveToElement(resources).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
	//	using doubleClick() method to login
		WebElement login = driver.findElement(By.partialLinkText("Login"));
		a.doubleClick(login).perform();
	//	getting the text
		String loginText = driver.getTitle();
		if(loginText.equals("Login - Vtiger"))
			System.out.println("Login is succesfully");
		else
			System.out.println("Login is not succesfully");	
		
		driver.close();
	}

}


