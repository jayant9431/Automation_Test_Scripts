/*WAS to understand the concept of different select and deselect operations  
 * and also understand the isMultiple() use to check ListBox is multiple selecting or not */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox41 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/HandlingMultiSelect41.html");
	//	selecting ListBox by their id and performing different select and deselect operations  
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("dosa");
		Thread.sleep(2000);
		s.deselectByIndex(0);
		s.deselectByValue("v");
		s.deselectByVisibleText("dosa");
	//	isMultiple() method return true if ListBox can take multiple select otherwise false
		System.out.println(s.isMultiple());
		
		driver.close();
		
	}

}
