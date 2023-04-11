/*Write a script to print html source of a web page.
 * */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlPage6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// this concept is extra in this question
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		
		String htmlCode = driver.getPageSource();
		System.out.println(htmlCode);
		
		driver.close();
	}

}
