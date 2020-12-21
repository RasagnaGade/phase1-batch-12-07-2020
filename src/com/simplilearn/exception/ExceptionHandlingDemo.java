package com.simplilearn.exception;

public class ExceptionHandlingDemo {
public static void transaction(int amount, String name) {
	try {
		int balance=2000;
		int res=balance/amount;
		name.length();
		int arr[]=new int[10];
		arr[11]=230;
	}catch(ArithmeticException e) {
		System.out.println("handled:"+e.getMessage());
		e.printStackTrace();
	}catch(NullPointerException e) {
		System.out.println("handled;"+e.getMessage());
	}catch (Exception e) {
		System.out.println("handled:"+e.getMessage() +e.getClass());
	}
	System.out.println("statement after try catch");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExceptionHandlingDemo.transaction(10,"abc");
	}

}
