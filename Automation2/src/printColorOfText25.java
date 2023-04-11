/*WAS to print the color of the forgot pwd link present in facebook
 * and understand the concept of getCssValue() method*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printColorOfText25 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://facebook.com");
		
		String color = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
		System.out.println(color);
		driver.close();
	}

}
