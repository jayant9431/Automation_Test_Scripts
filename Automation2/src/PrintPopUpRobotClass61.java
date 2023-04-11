/*Automate the following scenario
 * S1: open fire fox browser
 * S2: go to download page of selenium
 * S3: press ctrl+P to get print pop up
 * S4: select pages by pressing tab button
 * S5: press right arrow key 4 times to select the pages
 * S6: press 1-2 to take first two pages of the printout
 * S7: and click on print button by pressing enter.
 * */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class PrintPopUpRobotClass61 {
	static {		// Keep Mind at this below line
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new FirefoxDriver();	// Keep Mind at this line
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_2);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}










