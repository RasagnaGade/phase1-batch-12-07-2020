package com.simplilearn.typecasting;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		//WAP for taking a user Input as string and convert 
		//it into int,Byte,float,double and long
		System.out.println("Enter a string value");
		Scanner input=new Scanner(System.in);
		String price=input.nextLine();
		int intValue=Integer.parseInt(price);
		byte byteValue=Byte.parseByte(price);
		float FloatValue=Float.parseFloat(price);
		double doubleValue=Double.parseDouble(price);
		long longValue=Long.parseLong(price);
		
		input.close();
		
		System.out.println("int value is " +intValue);
		System.out.println("byte value is " +byteValue);
		System.out.println("float value is " +FloatValue);
		System.out.println("double value is " +doubleValue);
		System.out.println("long value is " +longValue);
		
	}

}
