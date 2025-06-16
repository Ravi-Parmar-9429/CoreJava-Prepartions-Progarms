package com.practice.corejava.string;

import java.util.ArrayList;
import java.util.Collections;

public class SortListDecesendingOrder {
	public static void main(String args[]) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(100);
		arrlist.add(9);
		arrlist.add(12);
		arrlist.add(15);
		arrlist.add(22);

		Collections.sort(arrlist , (i1,i2)->Integer.compare(i2, i1));
		System.out.println(arrlist);
	}
}
