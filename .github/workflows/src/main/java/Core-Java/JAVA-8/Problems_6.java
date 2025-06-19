package com.practice.corejava.java8;

/*
 Count Elements in a List that Start with a Specific Letter:
 Count the number of strings that start with the letter 'A'.
 * 
 */
import java.util.*;

public class Problems_6 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Apricot", "Blueberry");
		long result = words.stream().filter(s->s.startsWith("B")).count();
		System.out.println(result);
		
		List<Integer> list = Arrays.asList(10,20,30,40);
		long result1 = list.stream().count();
		System.out.println(result1);
	}

}
