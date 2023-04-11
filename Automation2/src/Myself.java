import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myself {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https:/Google.com/");
		
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(4000);
		
		List<WebElement> autosug = driver.findElements(By.xpath("//span[contains(.,'java')]"));	
		int count=autosug.size();
		System.out.println(count);
		
		/*for(int i=0;i<count;i++)
		{
			String text = autosug.get(i).getText();
			System.out.println(text);
		}*/
		
		for(WebElement i: autosug)
		{
			System.out.println(i.getText());
		}
		
		autosug.get(count-1).click();
		
		driver.close();
	}

}












