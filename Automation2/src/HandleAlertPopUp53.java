/*WAS to understand the concept of Alert/JavaScript Pop up 
 * and how to handle Alert pop up is very important otherwise 
 * it will throw UnhandledAlertException exception*/
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertPopUp53 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	//	clicking on "click the button to display an  alert box:" inside "Alert with OK" page        
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	//	Explicit wait in order to synchronize the script with selenium
	//	otherwise it will throw NoSuchElemenException 
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
	//	Alert class for working with alert pop up window
	//	sitchTo() method is use to transfer the execution control from browser to alert pop up window
		Alert a = driver.switchTo().alert();
	//	getting the text present in alert pop up window
		String text = a.getText();
	//	handling the alert pop up otherwise it will throw UnHandledAlertException exception
		a.accept(); 
	// 	we can also write => a.dismiss(); as we are working on Alert window not with Confirmation pop up
	//	we can also handle by using this below 
	//	driver.switchTo().alert().accept();
		System.out.println(text);
		
		driver.close();

	}

}
