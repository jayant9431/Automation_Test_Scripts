
/*WAS to close all the tabs without using quit() after clicking the actiTIME Inc. link */
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabCountAllClose73 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		
		Set<String> allWh = driver.getWindowHandles();
		
		int count=allWh.size();
		System.out.println(count);
		Thread.sleep(4000);
		
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
			driver.close();
		}
	}
}
