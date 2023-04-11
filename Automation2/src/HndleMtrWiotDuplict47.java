/*WAS to print all the options in mtr ListBox without duplicate
 * and understand how HashSet can be use for identifying the unique element */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.HashSet;
import java.util.List;

import java.util.Iterator;
public class HndleMtrWiotDuplict47 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	
	//	create object for HashSet
		HashSet<String> hs=new HashSet<String>();
		
	//	getting the URL
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/HandlingMultiSelect41.html");
		Thread.sleep(2000);
		
	//	selecting the ListBox and store element in List<WebElement>
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> allopts = s.getOptions();
		int count=allopts.size();
		
	//	storing the element from List<Element> to HashSet (IT IS IMPORTANT STEP)
		for(int i=0;i<count;i++)
		{
			String text = allopts.get(i).getText();
			hs.add(text);
		}  
		/* we can not use normal for loop to access the element of HashSet bcz insertion order 
		 * is not preserve in HashSet
		  
		  	for(int i=0;i<hs.size();i++)
			{
			 	System.out.println(hs.get(i));
			}
	
			it is possible to read the value by using for each loop of HashSet as below
		
			for(String uniqueText: hs)
			{
				System.out.println(uniqueText);
			} 
		*/
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		driver.close();
	}

}
