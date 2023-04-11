/*WAS to understand the how notification pop up will be blocked by ChromeOptions class object*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp62 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	//	this below object will change the setting of Chrome browser (Keep Mind on this Object creation)
		ChromeOptions opt=new ChromeOptions();
	//	remember this step => addArguments("--disable-notifications") to disable the notification
	// 	addArguments("--disable-notifications") this is example of method overloading
		opt.addArguments("--disable-notifications");
		
	//	ChromeDriver(opt) this is example of constructor overloading
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.yatra.com/");
		
		driver.close();	
	}

}
