package com.practice.corejava.exception;
/*
 * Java program to reverse each word of a given string
 * Input: Java is good programming langauges 
 * Output: avaJ si doog gnimmargorp seguagnal
 */

public class ReverseEachWordGivenStr {

	public static String reverse(String str) {
		String ans = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			ans = ans + str.charAt(i);
		}
		return ans;
	}

	public static void main(String args[]) {
		String input = "Java is good programming langauges";
		String splitStr[] = input.split(" ");
		String ans = "";
		for (int i = 0; i < splitStr.length; i++) {
			String rev = reverse(splitStr[i]);
			splitStr[i] = rev;
		}
		for (String s : splitStr) {
			ans = ans + s + " ";
		}
		System.out.println(ans);
	}
}
