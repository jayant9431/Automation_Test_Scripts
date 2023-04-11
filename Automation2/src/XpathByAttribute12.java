/*This Program is just for understanding how we can put xpath in program
 * and understand the concept of xpath by attribute */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute12 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/Htmlcode12.html");
		
		// below all are xpath by attribute in findElement() method
		// syntax for xpath by attribute => //tag[@A.N='A.V']
		driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button' and @value='A']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' and @value='B']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' or @type='button'] "));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' and @value='A' or @type='button' and @value='A']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='Checkbox' and @checked]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='Checkbox' and not(@checked)]"));
		Thread.sleep(2000);
		driver.close();
	}

}
