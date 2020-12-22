package com.simplilearn.methods.banks;

public class BankOperations {

	public static void main(String[] args) {
		
		Accounts ac=new Accounts();
		ac.Welcome();
		double res1=ac.showBalance();
		double res2=ac.withdraw(100);
		double res3=ac.deposit(50);
		
		System.out.println("res1:" +res1);
		System.out.println("res2:" +res2);
		System.out.println("res3:" +res3);

	}

}
