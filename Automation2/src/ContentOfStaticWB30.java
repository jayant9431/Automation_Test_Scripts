/*WAS to print the content of the web table present in the static web page*/
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContentOfStaticWB30 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/table.html");
		
		List<WebElement> allElement = driver.findElements(By.xpath("//td"));
		
		int count=allElement.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String text = allElement.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
