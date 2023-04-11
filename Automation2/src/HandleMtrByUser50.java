/*WAS to search for the specific option present in mtr ListBox by taking the input from the user*/
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMtrByUser50 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word=sc.nextLine();
		
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/HandlingMultiSelect41.html");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		
		List<WebElement> allOpts = s.getOptions();
		Thread.sleep(1000);
		
		for(int i=0;i<allOpts.size();i++)
		{
			 String text = allOpts.get(i).getText();
			 if(text.equals(word))
					System.out.println(text+" is present in the List Box");
		}
		
		sc.close();
		driver.close();

	}

}
