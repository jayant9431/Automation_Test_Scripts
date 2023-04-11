/*WAS to upload your resume on naukri*/
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadReume58 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).
									sendKeys("abhishek708777@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Abhishek@9470");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[.='UPDATE PROFILE'])[2]")).click();
		Thread.sleep(2000);
		File f=new File("./data/TestingExperiencedResume.docx");
		String absolutePath = f.getAbsolutePath();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(absolutePath);
		Thread.sleep(5000);
		driver.close();
	}

}













