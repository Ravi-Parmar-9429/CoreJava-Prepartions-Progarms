package com.practice.corejava.string;

public class StringMethodPractice {

	public static void main(String args[]) {
		String str = "ravi";

		// charAt-method ?
		// we need to pass the index then will get a particular character from index
		char ch = str.charAt(0);
		System.out.println(ch);

		// toCharArray()-Example
		// converting string to char array....
		char chArr[] = str.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		
		//Equals() method is for comparing the content of object.
		
		String str1 = new String("ravi");
		String str2 = new String("ravi");
		
		System.out.println(str1.equals(str2));
		
		//indexOfMethod -  give the index num of first charcater.
		
		String str3 = "rorckr";
		System.out.println(str3.indexOf('x'));
		
		//lastIndex-Of() method
		
		String str4 = "rorckr";
		System.out.println(str4.lastIndexOf('r'));
		
		//trim()-method it is removing the leading spaces
		
		String str5 = " ravi parmar";
		String str6 = str5.trim();
		System.out.println(str6);
		
		//contains-Method
		String str7  = "ravi parmar";
		System.out.println(str7.contains(" "));
		
		//substring() method practice.
		String str8  = new String("raviparmar");
		String substr  = str8.substring(1,5);
		
		System.out.println(substr);
		String substr1 = str8.substring(5);
		System.out.println(substr1);
		
	}

}
