/*WAS to find the height and width of login button of facebook
 * and understand the getSize() method and getHeight(), getWidth() method  */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeLogin20 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement lgbt = driver.findElement(By.name("login"));
		int height = lgbt.getSize().getHeight();
		int width = lgbt.getSize().getWidth();
		System.out.println("height of login button : "+height);
		System.out.println("width of login button : "+width);
		driver.close();
	}

}
