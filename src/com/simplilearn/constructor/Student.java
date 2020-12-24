package com.simplilearn.constructor;

public class Student {
	
	
	public static void main(String[] args) {
		Students std = new Students();
		std.showStudent(12, "andy", 100);
	}
}

    class Students 
   {
	int no;
	String name;
	int marks;

	 void showStudent(int no, String name, int marks) {
		this.no = no;
		this.name = name;
		this.marks = marks;
		System.out.println("student with " + no + " and name " + name +" scored " +marks) ;

	}

}
