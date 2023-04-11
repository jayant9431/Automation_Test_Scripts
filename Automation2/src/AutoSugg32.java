/*WAS to navigate to google.com and type selenium in search textbox and capture all the auto suggestion
 * and print it on the console and select the last auto suggestion */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg32 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://Google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		
		List<WebElement> autosug = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
		
		int count=autosug.size();
		System.out.println(count);
		
		/*for(WebElement i: autosug)
		{
			System.out.println(i.getText());
			
		}*/
		for(int i=0;i<count;i++)
		{
			String text = autosug.get(i).getText();
			System.out.println(text);
		}
		
		autosug.get(count-1).click();
		driver.close();
	}

}
