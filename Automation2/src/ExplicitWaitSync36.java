/*WAS to understand the concept of Explicit wait with ExpectedConditions titleContains
 * and ExpectedConditions visibilityOfElementeLocated */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitSync36 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("Enter "));
		
		String title=driver.getTitle();
		System.out.println(title);
	//	this below visibilityOfElementLocated() method will find element is visible or not to the user 
	//  this is not going to logout from the application 	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
	//	we can also use
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logoutLink")));
		
		driver.close();

	}

}
