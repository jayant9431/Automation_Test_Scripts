/*WAS to scroll to a particular element in bbc.com*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarExectLocation86 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.bbc.com/");
	//	below getting the pixel of "CEO Secrets" location
		int y = driver.findElement(By.xpath("//a[text()=' CEO Secrets ']")).getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,"+y+")");	// REMEMBER THIS LINE
		
		Thread.sleep(2000);
		driver.close();	
	}
}