/*WAS to enter "Jsp" in t2 text box and "Qsp" in t1 text box*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame82 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/HandleFrame1.html");
		
	//	Transferring the control to child frame
		driver.switchTo().frame(0);	// remember this step to changing the frame control
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("Jsp");
		
	//	transferring the control parent frame
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("Qsp");
		
		Thread.sleep(2000);
		driver.close();

	}

}
