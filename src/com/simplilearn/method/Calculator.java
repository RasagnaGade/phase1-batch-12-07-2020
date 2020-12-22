package com.simplilearn.method;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		Scanner input = new Scanner(System.in);
		System.out.println("::welcome to calculator");
		System.out.println("Enter num one:");
		int num1 = input.nextInt();
		System.out.println("enter num two");
		int num2 = input.nextInt();
		input.close();

		cal.add(num1, num2);
		cal.sub(num1, num2);
		cal.mul(num1, num2);
		cal.div(num1, num2);
	}

//addition
	public void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("Addition:" + result);
	}

	// Subtraction
	public void sub(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("Subtraction:" + result);
	}

	// multiplication
	public void mul(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("multiplication:" + result);
	}

	// division
	public void div(int num1, int num2) {
		int result = num1 / num2;
		System.out.println("division:" + result);
	}

}
