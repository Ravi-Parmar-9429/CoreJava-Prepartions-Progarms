package com.practice.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Problems: 
//In a given list containing numbers we need to filter even no and print them.

public class Problems_1 {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(10, 11, 12, 13, 14, 15);
		/*list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		*/
		//list = List.of(10,11,12,13,14,15);
		
		list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		
		//lets say if we want to collect then what would be method ?
		List<Integer> even = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		//we can collect in the set as well
		Set<Integer> evenSet  = list.stream().filter(i->i%2==0).collect(Collectors.toSet());
		System.out.println(evenSet);
		
	}
}
