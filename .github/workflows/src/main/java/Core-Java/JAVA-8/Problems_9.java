package com.practice.corejava.java8;

import java.util.*;
import java.util.stream.*;

/*
 Remove Duplicate Elements from a List Using Stream API:
 Given a list of integers, remove duplicate elements and return a unique list.
*/

public class Problems_9 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 2, 2, 2, 2, 2, 3, 4, 5, 3, 2, 5, 6, 7, 8, 6);
		List<Integer> uniqueList = new ArrayList<Integer>();

		list.stream().collect(Collectors.groupingBy(i -> (int) i, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).forEach(e -> uniqueList.add(e.getKey()));

		System.out.println(uniqueList);

	}
}
