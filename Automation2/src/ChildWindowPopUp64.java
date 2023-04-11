/*WAS to understand the concept of Child window pop up
 * and understand the working getWindowHandle() for printing window handle*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp64 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https:/secure.indeed.com/");
		driver.manage().window().maximize();
		
	//	getWindowHandle() method will get the address of the window and store it in wh (window handle)
		String wh=driver.getWindowHandle();
		System.out.println(wh);
		
		Thread.sleep(2000);
		//driver.close();

	}

}
