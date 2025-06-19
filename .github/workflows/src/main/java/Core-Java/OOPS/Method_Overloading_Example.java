package com.practice.corejava.oops;

class Bank {

	
	//so here deposit method is method overloading....
	
	public void deposit(String byAtm, double amount) {
		System.out.println("Amount deposited : byAtm successfully");
	}

	public void deposit(int cash, double amount) {
		System.out.println("Amount deposited : byCash successfully");
	}

}

public class Method_Overloading_Example {

	// If we are having multiple method with the same name but diff paramter
	// is called method overloading

	public static void main(String args[]) {
		Bank bank = new Bank();
		bank.deposit("Hdfc-Atm", 1000.0);
	}

}
