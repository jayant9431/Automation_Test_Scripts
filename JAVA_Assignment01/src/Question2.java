// 2.Write a program to reverse digits of a number enter by user.
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();//num=345
		int reverse=0;//reverse=0
		while(num!=0)//345!=0true//34!=0true//3!=0true  //0!=0false
		{
			int remainder=num%10; //rem=345%10=5  //rem=34%10=4  //rem=3%10=3
			reverse=reverse*10+remainder; //rev=0*10+5=5//  rev=5*10+4=54// rev=54*10+3=543
			num=num/10; //num=345/10=34// num=34/10=3// num=3/10=0
		}
		System.out.println("reverse number="+reverse);//543
		sc.close();
	}

}
