package com.practice.corejava.oops;

interface Parent {

	public abstract void work();

}

class Child implements Parent {

	public void work() {
		System.out.println("Work is doing by Child");
	}

}

public class InheritanceExample_ImplementsKW {

	public static void main(String args[]) {
		Child child = new Child();
		child.work();
	}

}
