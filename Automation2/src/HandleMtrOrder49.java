/*WAS to print all the options present in mtrListBox in alphabetical order
 * and understand the use of TreeSet for automatically sort the options(elements)*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.TreeSet;
import java.util.*;

public class HandleMtrOrder49 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		TreeSet<String> ts=new TreeSet<String>();
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/HandlingMultiSelect41.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		Thread.sleep(1000);
		List<WebElement> allOpts = s.getOptions();
		int count=allOpts.size();
		Thread.sleep(1000);
		for(int i=0;i<count;i++)
		{
			String text = allOpts.get(i).getText();
			ts.add(text);
		}
		Thread.sleep(2000);
		
	//	we can't access the HashSet using normal for loop bcz insertion order is not maintained in HashSet
	//	while we can access by using Iterator.
		Iterator<String> it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		} 
	/*	we can also access from TreeSet by using below for each loop in alphabetical order 
		for(String k:ts)
		{
			System.out.println(k);
		}
		*/
		driver.close();
		
	}

}




