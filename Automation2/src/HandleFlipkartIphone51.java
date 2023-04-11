/*WAS to navigate to flipkart.com and search for iphone 14 and print all the 
 * iphone 14 product name along with price in the below format
 * Product Name ---> Product Price*/
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFlipkartIphone51 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		List<WebElement> productName = driver.findElements(By.xpath("//div[contains(text(),"
																	+ "'APPLE iPhone 14')]"));
		List<WebElement> productPrice = driver.findElements(By.xpath("//div[contains(text(),"
										+ "'APPLE iPhone 14')]/../../..//div[@class='_30jeq3 _1_WHN1']"));
		
		int count=productName.size();
		Thread.sleep(2000);
		for(int i=0;i<count;i++)
		{
			String text = productName.get(i).getText();
			String text2 = productPrice.get(i).getText();
			System.out.println(text+" ---> "+text2);
		}
		
		driver.close();		
	}

}
