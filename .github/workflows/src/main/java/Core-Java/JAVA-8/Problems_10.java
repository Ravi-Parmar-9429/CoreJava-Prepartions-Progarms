package com.practice.corejava.java8;

/*
 Find the Second-Highest Number in a List:
 Given a list of integers, find the second-highest number using Stream API
*/
import java.util.Arrays;
import java.util.List;

public class Problems_10 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 0, 15);
		int secondHighest = list.stream().sorted((i1, i2) -> Integer.compare(i2, i1)).skip(1).findFirst().get();
		System.out.println(secondHighest);
	}
}
