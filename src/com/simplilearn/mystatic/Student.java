package com.simplilearn.mystatic;

public class Student {

	int rollno;
	static String college="abc college";
	
	public static void showCollege()
	{
		System.out.println("college name:: " +college);
	}
	
	public void display() {
		System.out.println("Roll no:: " +rollno);
	}
}
