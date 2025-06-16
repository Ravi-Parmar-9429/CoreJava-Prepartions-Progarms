package com.practice.corejava.string;

//Declared the class as a final.
import java.util.*;

public class GroupOfAnagrams {

	public static void main(String args[]) {
		String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		Map<String, List<String>> map = new HashMap();
		for (int i = 0; i < str.length; i++) {
			char ch[] = str[i].toCharArray();
			Arrays.sort(ch);
			String newString = new String(ch);
			if (map.containsKey(newString)) {

				List<String> arrlist = map.get(newString);
				arrlist.add(str[i]);
				map.put(newString, arrlist);
				
			} else {
				ArrayList<String> arrlist = new ArrayList<String>();
				arrlist.add(str[i]);
				map.put(newString, arrlist);
			}

		}
		System.out.println(map);
	}
}
