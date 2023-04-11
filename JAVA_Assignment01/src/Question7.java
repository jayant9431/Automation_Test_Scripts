//WAP to swap two number using third variable.
import java.util.Scanner;  
class Question7 {  
    public static void main(String[] args) { 
    	// TODO Auto-generated method stub
        int x, y, z;   
        Scanner sc = new Scanner(System.in);  
        System.out.println("enter value of x and y");  
        x = sc.nextInt();  
        y = sc.nextInt();  
        System.out.println("before swapping number: "+x +" "+y);  
        x = y;
        z = x; 
        y = z;  
        System.out.println("after swapping: "+x +" " +y);  
       
    sc.close();
    }    
}  