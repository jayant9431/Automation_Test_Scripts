/*WAS to scroll to the bottom of the web page and then on top in bbc.com*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToBottom87 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.bbc.com/");
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
	//	below code will scroll to down of the web page
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
	//	below code will scroll to up of the web page
		j.executeScript("window.scrollTo(0,0)");

		Thread.sleep(2000);
		driver.close();
	}

}
