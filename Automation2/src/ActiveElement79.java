/*WAS to type "java" in search text box present in google without using findElement() method
 * after writing this "driver.switchTo().activeElement().sendKeys("java");" we can do.
 * */
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement79 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://google.com/");
		// activeElement() method search for active element like blinking vertical line in search box
		driver.switchTo().activeElement().sendKeys("java");
		Thread.sleep(2000);
		driver.close();
	}

}
