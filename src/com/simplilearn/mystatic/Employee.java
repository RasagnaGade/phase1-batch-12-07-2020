package com.simplilearn.mystatic;

public class Employee {
	int id;
	static String name="andy";
	
	public static void showEmployee()
	{
		System.out.println("employee name:: " +name);
	}
	
	public void display() {
		System.out.println("employee id:: " +id);
	}







	public static void main(String[] args)
	{
		System.out.println("my name:: "+Employee.name);
		Employee.showEmployee();
		
		Employee e=new Employee();
		System.out.println("Employee id::" +e.id);
		e.display();
		
	}
	}


