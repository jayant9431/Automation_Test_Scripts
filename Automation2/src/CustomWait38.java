/*WAS to check whether login page is loaded within 7 second or not
 * for that we use driver.manage().timeouts().pageLoadTimeout() method*/
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait38 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
		
		try {
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("page is loaded within 7 seconds and pass");
		}
		catch(Exception e)
		{
			System.out.println("page is not loaded within 7 second and fail");
		}
		
		driver.close();
	}

}
