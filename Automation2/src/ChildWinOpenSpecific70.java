/*WAS to close all browser except specific window*/
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWinOpenSpecific70 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("Enter the title of browser: ");
		Scanner sc=new Scanner(System.in);
		String expTitle=sc.nextLine();
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https:/secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		
		Set<String> allWh = driver.getWindowHandles();
		
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
			String actualTitle = driver.getTitle();	
			if(expTitle.equals(actualTitle)){
				
			}
			else {
				driver.close();
			}
		}
		sc.close();
	}	
}




