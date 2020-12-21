package com.simplilearn.exception;

public class ThrowExceptionDemo {
public static void throwException(){
	

	 
	try {
if(true)throw new Exception("exception msg here...");
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
public static void ageValidator(int age)
{
	try {
		if(age>18) {
			System.out.println("welcome");
		}else {
			throw new Exception ("Not a valid age");
		}
	}catch (Exception e) {
	e.printStackTrace();
	}
}



	public static void main(String[] args) {
		ThrowExceptionDemo.ageValidator(17);
		
	}
}
