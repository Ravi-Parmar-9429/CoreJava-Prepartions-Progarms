package com.practice.corejava.exception;

public class AtmRealTimeExample {

	public static int currentBalance = 100000;

	public static void withdraw(int enterAmount) throws Exception {
		if (enterAmount > currentBalance) {
			throw new RuntimeException("Insufficent Balance");
		} else {
			System.out.println("Amount Withdraw");
		}
	}

	public static void main(String args[]) throws Exception {
		withdraw(10000001);
	}

}
