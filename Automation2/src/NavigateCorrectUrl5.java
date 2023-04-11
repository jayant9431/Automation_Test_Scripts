/*Write a script to check whether seleniumhq.org is successfully
 * navigation to selenium.dev or not
 * */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCorrectUrl5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/")) {
			System.out.println("URL is navigating successfully and Pass");
		}
		else
		{
			System.out.println("URL is not navigating successfully and Fail");
		}
		Thread.sleep(2000);
		//driver.close();
	}
}
