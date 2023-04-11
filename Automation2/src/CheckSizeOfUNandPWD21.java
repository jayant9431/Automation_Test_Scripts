/*WAS to check the dimension of username and PWD of actiTIME */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSizeOfUNandPWD21 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement size1 = driver.findElement(By.name("username"));
		int h1 = size1.getSize().getHeight();
		int w1 = size1.getSize().getWidth();
		
		WebElement size2 = driver.findElement(By.name("pwd"));
		int h2 = size2.getSize().getHeight();
		int w2 =size2.getSize().getWidth();
		
		if(h1==h2 && w1==w2)
			System.out.println("size of username and pwd is equal");
		else
			System.out.println("size of username and pwd is not equal");
	}

}
