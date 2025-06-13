package com.practice.corejava;
import java.util.*;
public class UsesOfTreeMap {

	public static void main(String args[]) {
		TreeMap treemap = new TreeMap();
//		treemap.put("ravi", 1);
//		treemap.put("khush", 2);
//		treemap.put("mangle",3);
//		treemap.put("rax", 1);
		
		treemap.put(1,"x");
		treemap.put(100,"dost");
		treemap.put(15, "xx");
		treemap.put(null, "");
		
		System.out.println(treemap);//get result based on sorting order(Asec) of key
	}
	
}
