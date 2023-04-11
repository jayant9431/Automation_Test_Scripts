import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
* Test to automate:
* Launch the Firefox.
* Opens google.com
* Type "selenium tutorials techlistic" in search bar
* Wait for ajax suggestion box to appear
* Print all the suggestions one by one
*
*/

public class AjaxGoogleSearch {

	public static void main() {

	// Set Driver path
	System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	//open google
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//enter techlistic tutorials in search box
	driver.findElement(By.name("q")).sendKeys("selenium tutorial techlistic");

	//wait for suggestions
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sbtc")));

	WebElement list=driver.findElement(By.className("sbtc"));
	List<WebElement> rows=list.findElements(By.tagName("li"));

	for(WebElement elem:rows) {
	System.out.println(elem.getText());
	}
	}
}
