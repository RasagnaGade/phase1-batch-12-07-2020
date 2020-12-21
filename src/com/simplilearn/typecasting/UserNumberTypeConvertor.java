package com.simplilearn.typecasting;

import java.util.Scanner;

public class UserNumberTypeConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a integer number::");
		int userInput = input.nextInt();
		
		byte byteData=(byte)userInput;
		short shortData=(short)userInput;
		float floatData=userInput;
		double doubleData=userInput;
		
		System.out.println("the user enter value is::" +userInput);
		System.out.println("the converted byte value is::" +byteData);
		System.out.println("the converted short value is::" +shortData);
		System.out.println("the converted float value is::" +floatData);
		System.out.println("the converted double value is::" +doubleData);

	}

}
