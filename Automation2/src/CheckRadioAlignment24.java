/*WAS to check whether the gender radio button are properly aligned or not present in facebook
 * after clicking on "create new account" button*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckRadioAlignment24 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		int y1=driver.findElement(By.xpath("//input[@value='1']")).getLocation().getY();  // female radio button
		int y2=driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();  // male   radio button
		int y3=driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY(); // others radio button
			    		
		if(y1==y2 && y1==y3 && y2==y3)
			System.out.println("gender radio button is properly aligned and pass");
		else
			System.out.println("gender radio button is not properly aligned and fail");
		driver.close();
	}

}
