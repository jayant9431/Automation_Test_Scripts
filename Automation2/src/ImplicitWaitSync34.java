/*WAS to understand the concept of implicit wait (one of the many ways of synchronization) */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitSync34 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		// Specifying the implicit wait which work for entire program after once 
		// it specify but only work for fE and fEs method
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// enter the URL
		driver.get("https://demo.actitime.com/login.do");
		
		//enter the login id and pwd and click on login button then after on logout button
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.id("logoutLink")).click();
		
		driver.close();
	}

}
