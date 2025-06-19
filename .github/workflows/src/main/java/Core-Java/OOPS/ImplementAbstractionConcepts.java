package com.practice.corejava.oops;

//What is abstraction?
/*
 * abstarction is one of the most imp oops principle in java.
 * to hiding an internal implementation details and just providing 
 * only the neccessery details is called abstraction.
 * Example - Atm we have atm , in atm diff functionality is there
 * withdraw , deposit , balanceEnquiry
 * 
 * we can implement abstraction by using interface and abstract class.

*/
interface Atm {

	public abstract void showMsg();

	public abstract double withdraw(double amountEnter);

	public abstract void deposit(double amountEnter);

}

 class HdfcATM implements Atm {
	
	public void showMsg() {
		System.out.println("Welcome to Hdfc Bank Atm");
	}
	
	public double withdraw(double amountEnter) {
		return amountEnter;
	}

	public void deposit(double amountEnter) {
		System.out.println("Deposit amount successfully At HDFC bank: " + amountEnter);
	}
}

 class SBIAtm implements Atm{
	public double withdraw(double amountEnter) {
		return amountEnter;
	}

	public void deposit(double amountEnter) {
		System.out.println("Deposit amount successfully in Sbi Account : " + amountEnter);
	}

	@Override
	public void showMsg() {
		
	}
}

public class ImplementAbstractionConcepts {
	
	public static void main(String args[]) {
		Atm atm = new HdfcATM();
		atm.deposit(1000);
		
	}

}
