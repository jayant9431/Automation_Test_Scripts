/*WAS to print all the options(elements) present in mtr ListBox without using any looping statement
 * and understand the concept of getWrappedElement*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleListWrapperElement45 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/HandlingMultiSelect41.html");
		Thread.sleep(2000);
		
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		// by use of getWrappedElement we can get elements of ListBox without any looping statement
		String text = s.getWrappedElement().getText();
		System.out.println(text);
		
		driver.close();
	}

}
