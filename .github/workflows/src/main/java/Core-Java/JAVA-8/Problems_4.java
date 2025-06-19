package com.practice.corejava.java8;

//List<Integer> numbers = Arrays.asList(7, 3, 9, 1, 6);
//Sort a List of Integers in Descending Order:
import java.util.*;
import java.util.stream.Collectors;

public class Problems_4 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(7, 3, 9, 1, 6);
		numbers = numbers.stream().sorted((i1, i2) -> Integer.compare(i2, i1)).collect(Collectors.toList());
		System.out.println(numbers);
	}
}
