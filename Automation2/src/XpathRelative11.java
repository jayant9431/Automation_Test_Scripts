/*WAS to understand the concept of relative xpath */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRelative11 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANT/Desktop/Selenium%20Program/contentForGroupIndex(xpath)10&11.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[1]/a[1]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//div[2]/a[1]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		//below xpath is for two link but 1st link always will be open and 2nd link will not open
		driver.findElement(By.xpath("//a[1]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		//below xpath is for two link but 1st link always will be open and 2nd link will not open
		driver.findElement(By.xpath("//a[2]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
	}

}
