package com.practice.corejava.string;

final class CreateImmutableEmployee {

	private final int eid;
	private final String ename;

	public CreateImmutableEmployee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}
}

public class CreateImmutable_Example1 {
	public static void main(String args[]) {
		CreateImmutableEmployee createImmutableEmployee = new CreateImmutableEmployee(101, "ravi");
		System.out.println(createImmutableEmployee.getEid());
		System.out.println(createImmutableEmployee.getEname());
	}
}
