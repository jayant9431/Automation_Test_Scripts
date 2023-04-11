/*WAS to perform drag and drop */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop80 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	//	here source => kisko uthana hai (drag) and target => kaha drag kr ke rakhna hai
		WebElement source = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement target = driver.findElement(By.xpath("//h1[.='Block 4']"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
	//	execution of drag and drop by below method
		a.dragAndDrop(source, target).perform();
		Thread.sleep(2000);
		driver.close();
		
	}
}
