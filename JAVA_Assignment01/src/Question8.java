// WAP to swap two number without using third variable.
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("before swapping");  
	    int x = 40;  
	    int y = 50;  
	    System.out.println("value of x:" + x);  
		System.out.println("value of y:" + y);  
		System.out.println("after swapping");  
	    x = x + y;  
	    y = x - y;  
		x = x - y;  
		System.out.println("value of x:" + x);  
		System.out.println("value of y:" + y);  
	}  
}   
	
