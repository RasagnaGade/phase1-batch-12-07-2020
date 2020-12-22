package com.simplilearn.method;

import java.util.Scanner;

public class AvgExample {

	public static void main(String[] args) {
	
		
		System.out.println("enter any 4 numbers");
		Scanner input =new Scanner(System.in);
				int num1=input.nextInt();
				int num2=input.nextInt();
				int num3=input.nextInt();
				int num4=input.nextInt();
				input.close();
				int avg=num1+num2+num3+num4/4;
				System.out.println("Average of given numbers is:" +avg);

			
	}

}
