/*WAS to understand the concept of Select class (Select class is parameterized constructor )
 * and understand the use of some method like
 * selectByIndex(argument), selectByValue(argument), selectByVisibleText(argument)*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox39 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement monthListBox = driver.findElement(By.id("month"));
		Select s=new Select(monthListBox);
		s.selectByIndex(10); // 10 means November as index start from January which is 0
		Thread.sleep(2000);  
		s.selectByValue("7");// 7 means July as month value start from 1 as January
		Thread.sleep(2000);
		s.selectByVisibleText("Jan"); // Jan means text value of month. 
		
	}

}
