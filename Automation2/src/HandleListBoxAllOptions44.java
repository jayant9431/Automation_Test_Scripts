/*WAS to print all the options present in checkpost ListBox
 * and understand work of getOptions() method*/
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleListBoxAllOptions44 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/HandlingMultiSelect41.html");
		Thread.sleep(2000);
		
		WebElement cpListBox = driver.findElement(By.id("cp"));
		
		Select s=new Select(cpListBox);
		//getOptions() method will take all the element present in the ListBox 
		//irrespective of it is selected or not.
		List<WebElement> allOptions = s.getOptions();
		
		for(WebElement i: allOptions)
		{
			String text = i.getText();
			System.out.println(text);
		}
		driver.close();
		
	}

}
