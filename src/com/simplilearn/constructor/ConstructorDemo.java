package com.simplilearn.constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		//Employee emp = new Employee();
		//emp.id = 101;
		//emp.name = "andy";
		//Employee emp=new Employee(101);
		//Employee emp=new Employee("Andy Smith");
		Employee emp=new Employee(101, "Andy Smith");
		emp.showExployee();

	}

}

class Employee {

	int id;
	String name;

	void showExployee() {
		System.out.println("Employee with " + id + " and name " + name);
	}

	public Employee(int id) {
		this.id = id;

	}

	public Employee(String name) {
		this.name = name;

	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;

	}

}