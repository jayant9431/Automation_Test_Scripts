/*IT's Very IMPORTANT FOR INTERVIEW
 * WAS to copy the text present in one text box and paste it into another text box*/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteTextFrmTxtFild59 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/Htmlcode12.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.CONTROL+"av");
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
