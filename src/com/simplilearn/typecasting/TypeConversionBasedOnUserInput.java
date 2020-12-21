package com.simplilearn.typecasting;
import java.util.Scanner;

public class TypeConversionBasedOnUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number::");
		int userNumber=input.nextInt();
		
		double userDoubleValue=userNumber;
		long userLongValue=userNumber;
	    float userFloatValue=userNumber;
	    
	   
        System.out.println("integer count::" +userNumber);
        System.out.println("long count::" +userLongValue);
        System.out.println("float count::" +userFloatValue);
		

	}

}
