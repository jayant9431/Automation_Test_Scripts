/*WAS to check whether the usename and pwd textbox is properly aligned or not present in actitime*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UNabdPWDAlignment23 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//here we are checking the alignment of UN and PWD so we have to check w.r.t x-axis
		int x1=driver.findElement(By.id("username")).getLocation().getX();
		int x2=driver.findElement(By.name("pwd")).getLocation().getX();
		
		if(x1==x2)
			System.out.println("username and pwd textbox are properly aligned and pass");
		else
			System.out.println("username and pwd textbox are not properly aligned and fail");
	//	driver.close();
		
	}

}
