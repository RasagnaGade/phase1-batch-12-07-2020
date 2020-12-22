package com.simplilearn.methods.banks;

public class Accounts {
	
	private double balance=1201.68;
	private String name="andy";
	private String bankName="sbh";
	
	
//show balance
	public double showBalance() {
		System.out.println("User is " +name+" and balance amount is: " +balance);
		return balance;
		
		
	}
	
	public void Welcome() {
		System.out.println("-----------------------");
		System.out.println("welcome to " +bankName);
		System.out.println("-----------------------");
	}
	//withdraw
	public double withdraw(double amount) {

		if(amount<=balance) {
			 balance=balance-amount;
			
		}
		System.out.println("User is " +name+" and balance amount is: " +balance);
		return balance;
	}
	//deposit
	public double deposit(double money) {
		balance=balance+money;
		System.out.println("user is " +name+ " and balance is: " +balance);
		return balance;
	}
	
	
	
	
	
	
	
	
}
