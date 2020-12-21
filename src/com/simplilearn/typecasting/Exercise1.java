package com.simplilearn.typecasting;
import java.util.Scanner;


public class Exercise1 {

	public static void main(String[] args) {
		 //WAP for converting user input (int)  into float, 
		//double, long, and byte
		System.out.println("Enter any integer value to convert:");
		Scanner input=new Scanner(System.in);
		int price=input.nextInt();
		float floatValue=price;
		double doubleValue=floatValue;
		long longValue=(long)doubleValue;
		byte byteValue=(byte)doubleValue;
		
		
		System.out.println("int value is:" +price);
		System.out.println("float value is: " +floatValue);
		System.out.println("double value is: " +doubleValue);
		System.out.println("long value is: " +longValue);
		System.out.println("byte value is: " +byteValue);
		input.close();
		
	}

}
