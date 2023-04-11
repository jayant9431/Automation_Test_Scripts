/*WAS to print text of forgot your password link present in actiTIME
 * and understand the getText() method*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextOfForForgotPWD17 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).getText();
		System.out.println(text);
		driver.close();
	}
}
