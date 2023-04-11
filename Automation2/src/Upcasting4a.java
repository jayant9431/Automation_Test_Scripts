/*Write a script for making the code generic ( Upcasting or achieving generalization )
 * */
import org.openqa.selenium.WebDriver;

public class Upcasting4a {
	static void testA(WebDriver driver) throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
