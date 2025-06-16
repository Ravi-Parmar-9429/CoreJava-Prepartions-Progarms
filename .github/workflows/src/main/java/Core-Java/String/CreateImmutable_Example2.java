//package com.practice.corejava.string;
//
//final class Company {// this class is immutable class
//	private final int cid;
//	private final String cname;
//
//	public Company(int cid, String cname) {
//		this.cid = cid;
//		this.cname = cname;
//	}
//
//	public int getCid() {
//		return cid;
//	}
//
//	public String getCname() {
//		return cname;
//	}
//
//	@Override
//	public String toString() {
//		return "Company [cid=" + cid + ", cname=" + cname + "]";
//	}
//
//}
//
//final class Employee {// this class is also immutable
//	private final int eid;
//	private final String ename;
//	private final Company company;
//
//	public Employee(int eid, String ename, Company company) {
//		this.eid = eid;
//		this.ename = ename;
//		this.company = company;
//	}
//
//	public int getEid() {
//		return eid;
//	}
//
//	public String getEname() {
//		return ename;
//	}
//
//	public Company getCompany() {
//		return company;
//	}
//
//}
//
//public class CreateImmutable_Example2 {
//	public static void main(String args[]) {
//		Employee employee = new Employee(101, "ravi", new Company(1, "Hcl"));
//
//		System.out.println(employee.getEid());
//		System.out.println(employee.getEname());
//		System.out.println(employee.getCompany().getCid());
//		System.out.println(employee.getCompany().getCname());
//
//		// we can not modified the immutable class Employee and Company as they are
//		// final & private
//	}
//}
