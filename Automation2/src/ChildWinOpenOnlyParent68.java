/*WAS to close all the browser except the parent browser*/
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWinOpenOnlyParent68 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https:/secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		
		String parentWh = driver.getWindowHandle();	// This will only get the address of parent browser
		Set<String> allWh = driver.getWindowHandles();	// This will get address of all opened browser 
		
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
			if(parentWh.equals(wh))
			{
			// No statement required here
			}
			else
			{
				driver.close();
			}	
		}
	}
}
