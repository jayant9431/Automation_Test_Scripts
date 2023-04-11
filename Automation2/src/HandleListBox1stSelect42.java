/*WAS to print first selected option present in CheckPost ListBox
 * and understand the concept of getFirstSelectedOption() method*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleListBox1stSelect42 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/HandlingMultiSelect41.html");
	//	finding ListBox by their id
		WebElement cpListBox = driver.findElement(By.id("cp"));
	//	here passing the LsitBox into the select class
		Select s=new Select(cpListBox);
	//	first selected element address
		WebElement fsoption = s.getFirstSelectedOption();
	//	getting the text of that first selected element and printing 
		String text = fsoption.getText();
		System.out.println(text);
		
		driver.close();	
		
	}

}
