/*Write a script to open www.google.com using automation an print the title
 * */
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYANT\\Software\\Selenium\\chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYANT\\eclipse-workspace\\Automation2\\driver\\chromedriver.exe");
		
		/* this below object should be below to the 
		 * System.setProrerty("  "," ") line always
		   otherwise it will not work */
		ChromeDriver driver=new ChromeDriver();
				
		driver.get("https:facebook.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		//driver.close();
	}

}
