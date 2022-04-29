package com.edu;

public class Employee {
	private int eid;
	private String ename;
	private double esalary;
	
	public Employee(int eid, String ename, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public void display() {
		System.out.println("Employee id="+eid);
		System.out.println("Employee name="+ename);
		System.out.println("Employee salary="+esalary);
	}

}
