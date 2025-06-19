package com.practice.corejava.java8;

//Find Min and max and sum from list
import java.util.*;

public class Problems_7 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(7, 3, 9, 1, 6);

		int max = numbers.stream().mapToInt(i -> i).max().getAsInt();
		int min = numbers.stream().mapToInt(i -> i).min().getAsInt();
		int sum = numbers.stream().mapToInt(i->i).sum();

		System.out.println("Max: " + max);
		System.out.println("Min: "+min);
		System.out.println("Sum: "+sum);
	}

}
