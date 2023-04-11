/*WAS to check whether the facebook logo is displayed or not on facebook home page
 * and understand isDispalyed() method*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogo14 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		
		if(logo)
			System.out.println("logo is displayed and pass");
		else
			System.out.println("logo is not displayed and fail");
		driver.close();
	}

}
