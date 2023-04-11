/*Write a script to open www.facebook.com using automation an print the title
 * */
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();
		
	}

}
