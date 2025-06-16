package com.practice.corejava.string;

import java.util.*;
import java.util.Map.Entry;

public class SortMap {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 19, -1, 0, 15, 21, 15, 0 ,0};
		HashMap<Integer, Integer> hashmap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			hashmap.put(arr[i], hashmap.getOrDefault(arr[i], 0) + 1);
		}
		System.out.println(hashmap);

		// sort map based on keys
		TreeMap<Integer, Integer> treemap = new TreeMap<Integer, Integer>(hashmap);
		System.out.println(treemap);

		// sort map based on values
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		for (Entry<Integer, Integer> map : hashmap.entrySet()) {
			arrlist.add(map.getKey());
		}
        Collections.sort(arrlist , (i1,i2)->hashmap.get(i2).compareTo(hashmap.get(i1)));
        
        System.out.println(arrlist);
	}

}
