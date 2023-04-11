//1.Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and 
//  Computer, calculate percentage and grade according to given conditions:
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter marks of Physics");
		float a=sc.nextFloat();
		System.out.println("Enter marks of Chemistry");
		float b=sc.nextFloat();
		System.out.println("Enter marks of Biology");
		float c=sc.nextFloat();
		System.out.println("Enter marks of Mathematics");
		float d=sc.nextFloat();
		System.out.println("Enter marks of Computer");
		float e=sc.nextFloat();
		System.out.println("Enter maximum marks of Physics");
		float f=sc.nextFloat();
		System.out.println("Enter maximum marks of Chemistry");
		float g=sc.nextFloat();
		System.out.println("Enter maximum marks of Biology");
		float h=sc.nextFloat();
		System.out.println("Enter maximum marks of Mathematics");
		float i=sc.nextFloat();
		System.out.println("Enter maximum marks of Computer");
		float j=sc.nextFloat();
		float obtain_marks=a+b+c+d+e;
		float total_marks=f+g+h+i+j;
		float percentage;
		percentage = ((obtain_marks /total_marks) * 100);
		System.out.println("The percentage is "+percentage+  " % ");
		if(percentage>=90) 
		System.out.println("Grade A");
		else if(percentage>=80 && percentage<90) 
		System.out.println("Grade B");
	    else if(percentage>=70 && percentage<80) 
		System.out.println("Grade C");
		else if(percentage>=60 && percentage<70) 
		System.out.println("Grade D");
		else if(percentage>=40 && percentage<60) 
		System.out.println("Grade E");
		else 
		System.out.println("Grade F");
		sc.close();	
	}

}
