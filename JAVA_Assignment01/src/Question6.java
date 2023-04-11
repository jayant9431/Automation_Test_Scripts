// 6.Write a program to check whether a entered character 
//is lowercase ( a to z ) or uppercase ( A to Z ).
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any character:");
		char c=sc.next().charAt(0);
		if(c>='A' &&c<='Z')
		{
			System.out.println("upper case");
		}
		else 
		{
			System.out.println("lower case");
		
		}
	sc.close();
	}

}
