/*WAS to login to actitime by taking the data from the property file*/
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile89 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		FileInputStream fis=new FileInputStream("./data/PropertiFile.txt");
		Properties p=new Properties();
		p.load(fis);
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
