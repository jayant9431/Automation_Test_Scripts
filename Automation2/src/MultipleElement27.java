/*WAS to understand the concept of findElements() method
 * and its return type is List of WebElements and index start from 0 here but in group index by 1
 * and understand concept of size() method*/
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElement27 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/contentForGroupIndex(xpath)10,11&27.html");
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a")); // we can also use By.xpath("//a")
		int count=alllinks.size();
		System.out.println("Total number of link : "+count);
		
		WebElement link=alllinks.get(0);
		String text=link.getText();
	//  we can also write the above two line as below
	//  String text=alllinks.get(0).getText();
		System.out.println("text of first link : "+text);
		driver.close();
	}
	

}
