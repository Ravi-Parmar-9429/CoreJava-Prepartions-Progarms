package com.practice.corejava;

import java.util.Arrays;

//Problems: Given String is anagram or not ?
//Input str : "Listen" o/p - "Silent"

public class checkStringAnagram {

	public static  boolean checkAnagramApp_one(String input1, String input2) {
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();

		if (input1.length() == input2.length()) {
			char ch1[] = input1.toCharArray();
			char ch2[] = input2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					return false;
				}
			}
			return true;

		} else {
			return false;
		}

	}
	
	public static  boolean checkAnagramApp_two(String input1, String input2) {
		if(input1.length()==input2.length()) {
			input1=input1.toLowerCase();
			input2=input2.toLowerCase();
			
			char ch2[] = new char[input2.length()];
			
			for(int i=0;i<input1.length();i++) {
				for(int j=0;j<ch2.length;j++) {
					if(input1.charAt(i)==ch2[j]) {
						ch2[j]=' ';
						break;
					}
				}
			}
			String cnvrtStr = new String(ch2);
			if(cnvrtStr.isEmpty()) return true;
			else return false;
			
			
		}else {
			return false;
		}
	}

	public static void main(String args[]) {
		boolean checkAnagarm = checkAnagramApp_one("LListen","Silent");
		System.out.println(checkAnagarm);
		boolean checkAnagarm1 = checkAnagramApp_one("Listen","");
		System.out.println(checkAnagarm1);
	}

}
