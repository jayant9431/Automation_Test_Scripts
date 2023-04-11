/*WAS to navigate to flipkart.com and type iphone 14 pro max in search text box and capture all
 * the auto suggestion and print it on the console and select the last auto suggestion*/
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggFlipkart33 {
	//this statement is a key to connect selenium to chrome browser
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// entering url in the browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com/");
		Thread.sleep(1000);
		
		// clicking on cut button which automatically appear for login
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		// enter the text which i want to search into search text field
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 14 max pro");
		Thread.sleep(2000);
		
		// store auto suggested word in list<WebElement>
		List<WebElement> autosug = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		
		//count the auto suggested words
		int count=autosug.size();
		System.out.println("Total auto suggested content : "+count);
		
		// print all the suggested words
		for(int i=0;i<count;i++)
		{
			String text = autosug.get(i).getText();
			System.out.println(text);
		}
		
		//click on last suggested word
		autosug.get(count-1).click();
	}

}







