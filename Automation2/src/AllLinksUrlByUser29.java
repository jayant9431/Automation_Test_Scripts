/*WAS to take the URL from the user and count all the links of that web page and
 * print it all on the console */
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksUrlByUser29 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("Enter an URL : ");
		Scanner sc=new Scanner(System.in);
		String url = sc.nextLine();
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int count=alllinks.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String text = alllinks.get(i).getText();
			System.out.println(text);
		}
		driver.close();
		sc.close();
	}
}
