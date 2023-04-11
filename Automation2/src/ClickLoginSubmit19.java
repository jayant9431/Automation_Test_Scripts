/*WAS to click on the login button present in facebook without using click() method
 * and understand the submit() method*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLoginSubmit19 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// we can only use submit() method if type=submit() attribute is present
		driver.findElement(By.name("login")).submit();
		Thread.sleep(2000);
		driver.close();
	}

}
