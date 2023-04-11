/*WAP to read the data from Property file*/
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertyFile88 {

	public static void main(String[] args) throws IOException {
	//	get the path of Property file (relative path)
	//	get the java representative object of the physical file
		FileInputStream fis=new FileInputStream("./data/PropertiFile.txt");
	//	creating an object of Properties class and 
	//	pass the FileInputStream class object to access the data from property file(notepad) here 
		Properties p=new Properties();
		p.load(fis);
	//	getting the data by passing key
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");

		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
	}
}
