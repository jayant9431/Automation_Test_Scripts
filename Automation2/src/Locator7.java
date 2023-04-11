/*Write a script to understand the concept of different locators */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator7 {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/Htmlfor7,8&9.html");
		WebElement e = driver.findElement(By.tagName("a"));
		e.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("d1")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.name("n1")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.className("c1")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
