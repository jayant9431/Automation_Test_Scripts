/*WAS to type ABCD in t1 and t2 text box in alternative order character*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameABCD83 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/HandleFrame1.html");
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("A");
		Thread.sleep(2000);
		driver.switchTo().frame(0);	// changing frame by index value
		driver.findElement(By.id("t2")).sendKeys("B");
		Thread.sleep(2000);
		driver.switchTo().defaultContent(); // go to parent frame directly by defauldContent() method
		driver.findElement(By.id("t1")).sendKeys("C");
		Thread.sleep(2000);
		WebElement f = driver.findElement(By.xpath("//iframe")); // (//iframe) is xpath of child frame 
		driver.switchTo().frame(f);	// changing frame by string value
		driver.findElement(By.id("t2")).sendKeys("D");
		Thread.sleep(2000);
		driver.close();
	}

}
