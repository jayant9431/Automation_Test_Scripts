/*WAS to enter "manager" in the disabled password text box*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DisabledElement84 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/DisableElement.html");
		Thread.sleep(2000);
		driver.findElement(By.id("d1")).sendKeys("admin");
		
	//	downcasting of driver to RemoteWebDriver
		RemoteWebDriver r=(RemoteWebDriver) driver;
	/*	we can also do typecasting which is more secure than downcasting as below
	 * 	JavascriptExecutor j= (JavascriptExecutor) driver;
	 * 	j.executeScript("document.getElementById('d2').value='manager'");
	 * */
		Thread.sleep(2000);
		r.executeScript("document.getElementById('d2').value='manager'");	// REMEMBER THIS LINE
		Thread.sleep(2000);
		driver.close();
	}

}
