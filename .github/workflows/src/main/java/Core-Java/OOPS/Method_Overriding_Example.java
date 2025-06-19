package com.practice.corejava.oops;

class Banks {
	public void getIntrestRate() {
		System.out.println("7.5 % of Banks");
	}
}

class HdfcBank extends Banks {
	public void getIntrestRate() {
		System.out.println("5.5 % of HdfcBank");
	}
}

class ICICBank extends Banks {
	public void getIntrestRate() {
		System.out.println("10.5 % of ICICBank");
	}
}

public class Method_Overriding_Example {
	public static void main(String args[]) {
		Banks bank = new HdfcBank();
		bank.getIntrestRate();
	}
}
