/*Write a script for making the code generic ( Upcasting or achieving generalization )
 * */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upcasting4b {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1=new ChromeDriver();
		Upcasting4a.testA(driver1);
		WebDriver driver2=new FirefoxDriver();
		Upcasting4a.testA(driver2);
	}
}
