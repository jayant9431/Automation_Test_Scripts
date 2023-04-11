/*WAS to print all selected option present in checkpost listbox
 * and understand getAllSelectedOptions() method*/
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleListBoxAllSelected43 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	//	enter URL	
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/HandlingMultiSelect41.html");
	//	find the checkpost listbox 	
		WebElement cpListBox = driver.findElement(By.id("cp"));
	//	Pass the listbox in select class as an argument
		Select s=new Select(cpListBox);
		List<WebElement> allSelectedOption = s.getAllSelectedOptions();
	//	count the number of selected element in listbox
		int count=allSelectedOption.size();
		System.out.println(count);
		/*System.out.println(allSelectedOption); if we want to print like this then this will 
		 * not work same as array, we have to use for loop as below
		 */
	//	print the text of selected element in listbox
		for(int i=0;i<count;i++)
		{
			String text = allSelectedOption.get(i).getText();
			System.out.println(text);
		}
		
		driver.close();
		
	}

}
