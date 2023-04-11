/*WAS to navigate to bbc.com and capture all the latest business news and print in on the console*/
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlBBC52 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/news");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[.='Business'])[1]")).click();
		
		List<WebElement> LatestNewsHeading = driver.findElements(By.xpath("//span[contains(@class,'lx-stream-post__')]"));
	
		System.out.println("LATEST BUSINESS NEWS ON BBC WEBSITE");
		for(int i=0;i<LatestNewsHeading.size();i++)
		{
			String HeadLineText = LatestNewsHeading.get(i).getText();
			System.out.println(HeadLineText);
			
		}
		
		driver.close();
		
	}

}
