/*WAS to read and writing the data from property file using generic library*/
import java.io.IOException;

public class GenericLibraryReading96 {

	public static void main(String[] args) throws IOException {
	//	created object for generic class for access their non static method
		GenericLibrary95 gl=new GenericLibrary95();
		
	//	reading the data from Property file using getPropertyData method
		String un = gl.getPropertyData("username");
		System.out.println("userename is : "+un);
		
	//	reading the data from Excel File using getExcelData method
		String getURL = gl.getExcelData("Sheet2", 1, 0);
		System.out.println(getURL);
	
	//	writing the data in Excel File using setExcetData method
		gl.setExcelData("Sheet3", 9, 9, "Hello Automation");
		
	}
}
