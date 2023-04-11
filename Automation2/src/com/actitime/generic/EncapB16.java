/*Execution class for Encapsulation*/
package com.actitime.generic;

public class EncapB16 {

	public static void main(String[] args) {
		EncapA15 a=new EncapA15(10);
		
		int x=a.getValue();
		System.out.println("Value of i : "+x);
		
		a.setValue(30);
		System.out.print("Value of i after updating : ");
		System.out.print(a.getValue());
	}

}
