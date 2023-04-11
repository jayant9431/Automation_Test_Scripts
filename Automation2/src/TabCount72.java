/*WAS to count the number of tabs present in  the browser after clicking actiTIME inc. link 
 * handle same like handling child window browser*/
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabCount72 {
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
		Thread.sleep(2000);
		driver.quit();
	}
}

