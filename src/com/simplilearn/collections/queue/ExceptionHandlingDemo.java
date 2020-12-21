package com.simplilearn.collections.queue;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("1.Logic outside try");
		try {
			//code that may raise exception
			int data=100/10;
			System.out.println("2.logic inside try");
			
		}catch (Exception e) {
			System.out.println("3.Exception occurs");
		}
System.out.println("4.logic end");
	}

}
