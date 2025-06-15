package com.practice.corejava.exception;

public class Try_Catch_Rules {
	public static void main(String args[]) {
		// try without catch possible

		// try {
		//
		// }//Compilation Error

		/*
		 * without try catch is not possible catch(Exception e) { //
		 * 
		 * }
		 */

		/*
		 * CE - Try finally catch CE after try it should be catch block try { int x = 0
		 * / 0; } finally { System.out.println("finally block excecuted..."); }
		 * catch(Exception e) {
		 * 
		 * }
		 */

		// Try With Finally Allowed? Yes
		try {

		} finally {

		} // No CE errors.

		// single try CE:Errors
		/*
		 * try {
		 * 
		 * }
		 */
		// try with multiple catch blocks

		try {

		} catch (ArithmeticException e) {

		} catch (Exception e) {
			
		} finally {

		}

	}
}
