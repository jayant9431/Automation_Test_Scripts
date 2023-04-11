/*WAS to close all the browsers without using quit() method*/
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowAllClose67 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https:/secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		
		Set<String> allWh = driver.getWindowHandles();
		
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);// IMPORTANT LINE To give the control to different window 1 by 1
			// just writing driver.close() inside for each loop we can close windows without driver.quit()
			driver.close();	
		}
		
	}

}
