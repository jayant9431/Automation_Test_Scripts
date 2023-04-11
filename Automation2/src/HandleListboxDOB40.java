/*WAS to select DOB present in facebook after clicking "create new account" button*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleListboxDOB40 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	//	enter the URL	
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com/");
	//	click on Create new account
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
	//	selecting day of DOB and entering day by Select class	
		WebElement dayListBox = driver.findElement(By.id("day"));
		Select sd=new Select(dayListBox);
		sd.selectByValue("13");
		Thread.sleep(2000);
	//	selecting month of DOB and entering month by Select class
		WebElement monthListBox = driver.findElement(By.id("month"));
		Select sm=new Select(monthListBox);
		sm.selectByValue("3");
		Thread.sleep(2000);
	//	selecting year of DOB and entering year by Select class
		WebElement yearListBox = driver.findElement(By.id("year"));
		Select sy=new Select(yearListBox);
		sy.selectByValue("1997");
	}

}














