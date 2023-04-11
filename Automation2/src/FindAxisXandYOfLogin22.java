/*WAS to print X and Y axis of login button present in facebook 
 * and understand the getLocation() method and getX()/getY() method*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAxisXandYOfLogin22 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		int x = driver.findElement(By.name("login")).getLocation().getX();
		int y = driver.findElement(By.name("login")).getLocation().getY();
		
		System.out.println("x axis of login button"+x);
		System.out.println("y axis of login button"+y);
	}

}
