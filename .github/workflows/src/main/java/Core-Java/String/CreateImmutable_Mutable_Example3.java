package com.practice.corejava.string;

class Company {// this class is mutable class....
	int cid;
	String cname;

	public Company(int cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + "]";
	}

}

final class Employee {// this is an immutable class
	private final int eid;
	private final String ename;
	private final Company company;

	public Employee(int eid, String ename, Company company) {
		this.eid = eid;
		this.ename = ename;
		this.company = company;
				
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public Company getCompany() {
		return new Company(company.getCid() , company.getCname());
		//this is an immutablity new object is created and changed in the new object not in origanl object
	}

}

public class CreateImmutable_Mutable_Example3 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "ravi", new Company(3, "Accolite"));
		System.out.println(emp1.getEid());
		System.out.println(emp1.getEname());
		System.out.println(emp1.getCompany().getCid());
		System.out.println(emp1.getCompany().getCname());
		emp1.getCompany().setCid(10);//here the cid value will be changed to 10 so its mutable we need to make immutable
		System.out.println(emp1.getCompany().getCid());
		System.out.println(emp1.getCompany().getCname());
	}
}
