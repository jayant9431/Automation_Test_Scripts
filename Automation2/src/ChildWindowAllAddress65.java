/*WAS to print window handle of all the browser present in indeed after clicking on apple and facebook
 * and understand when we have to use getWindowHandles() method*/
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowAllAddress65 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https:/secure.indeed.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[.='Continue with Apple']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Continue with Facebook']")).click();
		Thread.sleep(1000);
	//	we use getWindowHandles() method when we have more then one window handle opened
		Set<String> allWh = driver.getWindowHandles();
		int count=allWh.size();
		System.out.println(count);
		
	//	we can not access the elements of set by normal for loop
		for(String wh:allWh)
		{
			System.out.println(wh);
		}
		
		driver.quit(); // quit() method will close all the opened window handle
	}

}

