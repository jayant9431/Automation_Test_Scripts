/*WAS to understand the concept of Authentication pop up */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp63 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		/*	https://admin:admin@the-internet.herokuapp.com/basic_auth
		 * in the above URL 1st admin=> username and 2nd admin=> password
		 * this is the way to handle the authentication pop up 
		 * */
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		driver.close();
	}

}
