/*WAS to understand the concept of Robot class*/
import java.io.IOException;

import java.awt.AWTException;
import java.awt.Robot;	// this import statement write by self
import java.awt.event.KeyEvent;	// this import statement write by self

public class RobotClassBasic60 {
		public static void main(String[] args) throws IOException, InterruptedException, AWTException  {
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(1000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_P);
		
	}

}
