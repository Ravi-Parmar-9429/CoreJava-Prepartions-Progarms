package com.practice.corejava.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
/*
 * Find Duplicate Elements in a List Using Stream API:
 * Given a list of integers, find all duplicate elements.
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 6);
 */
import java.util.*;

public class Problems_8 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 2, 2, 2, 2, 2, 3, 4, 5, 3, 2, 5, 6, 7, 8, 6);

		list.stream().collect(Collectors.groupingBy(i -> (int) i, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).forEach(e -> System.out.println(e.getKey()));

	}
}
