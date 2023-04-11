/*Automate the following scenario
 *step1: open the browser
 *step2: enter the URL : https://www.careinsurance.com/rhicl/proposalcp/renew/index-care
 *step3: enter the policy no.=123
 *step4: click on DOB and select your DOB
 *step5: Enter the contact no 9845098450
 *step6: click on "let's renew" button
 *step7: "verify the text "Please enter the valid policy no." is displayed or not */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision56 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver()	;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.className("form-control")).sendKeys("123");
		Thread.sleep(1000);
		
		driver.findElement(By.id("dob")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("ui-datepicker-month")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("ui-datepicker-year")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='13']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		Thread.sleep(1000);
		driver.findElement(By.id("renew_policy_submit")).submit();
		Thread.sleep(1000);
		WebElement addressOfText = driver.findElement(By.className("ValidationErrorsBot"));
		String text1 = addressOfText.getText();
		Thread.sleep(1000);
		System.out.println(text1);
		
		driver.close();		
		
	}

}
