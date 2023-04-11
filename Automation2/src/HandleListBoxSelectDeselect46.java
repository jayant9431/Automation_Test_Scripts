/*WAS to select all the options present in mtr ListBox and deselect it in reverse order
 * and in this program we can't use for each loop it will not work during selecting and deselecting*/
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleListBoxSelectDeselect46 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/HandlingMultiSelect41.html");
		
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		
		Select s=new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		
		int count=allOptions.size();
		
	/*	for each loop will not work here so below logic will not work
	   	for(WebElement k:allOptions)
		{
			s.selectByIndex(k);
		}
	*/
		for(int i=0;i<count;i++)
		{
			s.selectByIndex(i); // remember here s.SelectByIndex work, not i.selectByIndex
			Thread.sleep(1000);
		}
				
	//	for each loop will not work here bcz it is only for forward iteration
		for(int i=count-1;i>=0;i--)
		{
			s.deselectByIndex(i);
			Thread.sleep(1000);
		}
		
		driver.close();
	}

}