/*WAS to print only duplicate options present in mtr ListBox
 * and understand how HashSet is used to identify the duplicate values*/
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HndleMtrWithDuplict48 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		HashSet<String> hs=new HashSet<String>();
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/HandlingMultiSelect41.html");
		Thread.sleep(2000);
		
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		Thread.sleep(2000);
		List<WebElement> allOpts = s.getOptions();
		int count=allOpts.size();
		
	//	Identifying the duplicate value and print it
		for(int i=0;i<count;i++)
		{
			String text = allOpts.get(i).getText();
			if(hs.add(text)==false)		// THIS IS IMPORTANT CONCEPT OF THIS PROGRAM
				System.out.println(text);
		}
	/*	we can also write like below
		for(int i=0;i<count;i++)
		{
	 		String text = allOpts.get(i).getText();
			boolean x = hs.add(text);
			if(x==false)
				System.out.println(text);
		}

		
	// 	below  code will work, but it is not working in my chrome version it is showing in output
		Thread.sleep(2000);
	 	Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			String text = ((WebElement) allOpts).getText();
			boolean b=hs.add(text);
			if(b==false)
				System.out.println(it.next());
		}	*/
		
		driver.close();				
	}
}







