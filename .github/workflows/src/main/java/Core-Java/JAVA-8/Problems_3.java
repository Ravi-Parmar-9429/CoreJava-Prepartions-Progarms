package com.practice.corejava.java8;

//Convert a List of Strings to Uppercase: 
//List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Apricot", "Blueberry");
import java.util.*;
import java.util.stream.Collectors;

public class Problems_3 {
	public static void main(String args[]) {
		List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Apricot", "Blueberry");
		List<String> upperCase = words.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCase);
	}
}
