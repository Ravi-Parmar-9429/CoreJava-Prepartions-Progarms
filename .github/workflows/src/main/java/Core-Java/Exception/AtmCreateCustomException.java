package com.practice.corejava.exception;

class InsufficientFundsException extends RuntimeException {

	public InsufficientFundsException(String msg) {
		super(msg);
	}
}

public class AtmCreateCustomException {

	int balance = 1000;

	// withdraw
	public void withdraw(int enterAmount) {
		if (balance < enterAmount) {
			throw new InsufficientFundsException("balance is insufficient");
		} else {
			System.out.println("Collect the Money");
		}
	}

	public static void main(String[] args) {
		AtmCreateCustomException atmCreateCustomException = new AtmCreateCustomException();
		atmCreateCustomException.withdraw(10000);
	}

}
