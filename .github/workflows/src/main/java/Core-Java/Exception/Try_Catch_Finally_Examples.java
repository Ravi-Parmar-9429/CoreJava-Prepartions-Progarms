package com.practice.corejava.exception;

public class Try_Catch_Finally_Examples {
	public static void main(String args[]) {

		try {
			int num = Integer.parseInt("A");
			System.out.println(num);
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		} 
		catch (NumberFormatException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
