
// 4. WAP to find the given number is Armstrong or not.
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();//153
		int arm=num;//arm=153
		int reverse=0;
		while(num!=0)//153!=0true  //15!=0true  //1!=0true  //0!=0false
		{
			int remainder=num%10;//rem=153%10=3 //rem=15%10=5 //rem=1%10=1
			reverse=reverse+remainder*remainder*remainder;//rev=0+3*3*3=27//rev=27+5*5*5=27+125=152
			//rev=152+1*1*1=153
			num=num/10;//num=153/10=15 //num=15/10=1 //num=1/10=0
		}
		if(arm==reverse)//153==153
		System.out.println("armstrong number="+arm);
		else
			System.out.println("not a armstrong number="+arm);
		sc.close();
	}

}
