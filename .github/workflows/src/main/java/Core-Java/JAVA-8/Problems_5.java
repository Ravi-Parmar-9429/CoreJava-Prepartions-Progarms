package com.practice.corejava.java8;

import java.util.Arrays;
import java.util.List;

//Find the First Element from a List Using Stream API
//Find the Any Element from a List Using Stream API
public class Problems_5 {

	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(3, 9, 1, 6);
		int firstElement = numbers.stream().findFirst().get();
		System.out.println(firstElement);
		
		int findAny = numbers.stream().findAny().get();
		System.out.println(findAny);
	}

}
