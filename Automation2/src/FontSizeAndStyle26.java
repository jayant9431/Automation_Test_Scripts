/*WAS to print the font-size,font-style,color,font-family and text-alignment for
 * forgotten password link present in facebook
 * and understand the concept of getCssValue() method */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontSizeAndStyle26 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		String fontSize = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		String fontStyle = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-style");
		String fontColor = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
		String fontFamily = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
		String fonttxtAlign = driver.findElement(By.linkText("Forgotten password?")).getCssValue("text-align");
		
		System.out.println("font size : "+fontSize);
		System.out.println("font style : "+fontStyle);
		System.out.println("font color : "+fontColor);
		System.out.println("font family : "+fontFamily);
		System.out.println("font text alignment : "+fonttxtAlign);
		driver.close();
	}

}
