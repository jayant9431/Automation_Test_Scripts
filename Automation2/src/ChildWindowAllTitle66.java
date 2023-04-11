/*WAS to print all the title of all the browser present in indeed after
 * clicking in apple and facebook */
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowAllTitle66 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/secure.indeed.com/");
		
		
		driver.findElement(By.xpath("//span[.='Continue with Apple']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Continue with Facebook']")).click();
		Thread.sleep(1000);
		
		Set<String> allWh = driver.getWindowHandles();
		int count=allWh.size();
		System.out.println(count);
		Thread.sleep(2000);
		
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);	// IMPORTANT LINE To give the control to different window 1 by 1
			String title = driver.getTitle();
			System.out.println(title);
		}
		Thread.sleep(1000);
		driver.quit();
	}

}