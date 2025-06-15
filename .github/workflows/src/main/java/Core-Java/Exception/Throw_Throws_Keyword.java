package com.practice.corejava.exception;

public class Throw_Throws_Keyword {

	public static void throwingException() throws ArithmeticException {
		throw new ArithmeticException();
	}

	public static void throwCheckedExecption() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}

	public static void main(String args[]) {
		throwingException();//Unchecked-Exception
		try {
			throwCheckedExecption();////Checked-Exception//Must-Handled
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
