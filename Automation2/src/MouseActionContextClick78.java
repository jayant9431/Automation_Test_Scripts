/*WAS to open the actiTIME Inc. in the new window*/
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionContextClick78 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		
	//	Actions class usually use for handling mouse action
		Actions a=new Actions(driver);
		a.contextClick(link).perform(); // always remember this perform() method
		Thread.sleep(2000);
		
	//	Robot class usually use for writing text from keyboard
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);	//  it will open the link in new window 
	//	r.keyPress(KeyEvent.VK_T); if we write this then it will open link in new tab
	}
}