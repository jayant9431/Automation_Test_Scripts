import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*WAS to understand the concept of LinkText and Partial Link Text*/
public class Locator8 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/Htmlfor7,8&9.html");
		
		driver.findElement(By.linkText("Google")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Goo")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

}
