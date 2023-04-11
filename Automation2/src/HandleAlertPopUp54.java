/*Automate the following scenario
 * step1: open the browser
 * step2: enter the URL https://demo.automationtesting.in/Alerts.html
 * step3: Click on "Alert with OK & Cancel" button
 * step4: Click on "Cancel" button on pop up window
 * step5: Verify the text "You Pressed Cancel" is displaying or not*/
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertPopUp54 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	// clicking on "Alert with OK & Cancel"
		driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
		Thread.sleep(2000);
	// clicking on "click the button to display a confirm box " to get the pop up
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		String text1 = a.getText();
	//	handling the Alert pop up
		a.dismiss();
		System.out.println(text1);
		Thread.sleep(2000);
		WebElement text2 = driver.findElement(By.xpath("//p[@id='demo']"));
		String x = text2.getText();
		if(x.equals("You Pressed Cancel"))
			System.out.println("'"+x+"'"+" is displaying on the screen");
		
		driver.close();

	}

}
