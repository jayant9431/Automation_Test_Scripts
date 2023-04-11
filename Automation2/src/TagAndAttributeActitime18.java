/*WAS to print the tag name and the value of href attribute of the forgot your pwd link
 * present in actiTIME and understand getTagName() method and getAttribute()*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagAndAttributeActitime18 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		String tagName = driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).getTagName();
		System.out.println("tagName of forgot pwd in actiTIME : "+tagName);
		
		String ati = driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).getAttribute("href");
		System.out.println("attribute of forgot pwd of actiTIME : "+ati);
		
		driver.close();
	}

}
