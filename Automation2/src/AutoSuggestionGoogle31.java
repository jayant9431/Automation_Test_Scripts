/* Automate the following scenario
 * step1: opening the browser
 * step2: go to Google.com
 * step3: type java in search text box
 * sept4: i) find all the auto suggestion
 * step4: ii) print the count of auto suggestion
 * step5: print the text of all auto suggestion
 * step6: select the first auto suggestion
 * */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionGoogle31 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// step1: opening the browser
		WebDriver driver=new ChromeDriver();
		//step2: go to Google.com
		driver.get("https:/Google.com/");
	    //step3: type java in search text box
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000); // give wait for at least 2000ms
		
		//sept4: i) find all the auto suggestion
		List<WebElement> autosug = driver.findElements(By.xpath("//span[contains(.,'java')]")); 
		//step4: ii) print the count of auto suggestion
		int count=autosug.size();
		System.out.println(count);
		
		//step5: print the text of all auto suggestion
		for(int i=0;i<count;i++)
		{
			String text = autosug.get(i).getText();
			System.out.println(text);
		}
		
		/*we can also do by for each loop as below
		 *  for(WebElement i: autosug)
		 *	{
		 *		System.out.println(i.getText());
		 *	}  
		 * */
		
		//step6: select the first auto suggestion
		autosug.get(1).click();
		
		driver.close();
	}
}
