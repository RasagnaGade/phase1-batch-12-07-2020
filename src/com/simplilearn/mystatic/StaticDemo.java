package com.simplilearn.mystatic;

public class StaticDemo {

	public static void main(String[] args) {
		System.out.println("my college:: "+Student.college);
		Student.showCollege();
		
		Student s=new Student();
		System.out.println("Roll no::" +s.rollno);
		s.display();
		
	}

}
