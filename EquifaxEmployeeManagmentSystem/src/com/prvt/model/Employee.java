package com.prvt.model;

public class Employee {

	private int eid;
	private String firstName;
	private String lastNamel;
	private double phoneNo ;
	
	public Employee() {
	}

	public Employee(int eid, String firstName, String lastNamel, double phoneNo) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.lastNamel = lastNamel;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "\nEmployee [eid=" + eid + ", firstName=" + firstName + ", lastNamel=" + lastNamel + ", phoneNo=" + phoneNo
				+ "]";
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNamel() {
		return lastNamel;
	}

	public void setLastNamel(String lastNamel) {
		this.lastNamel = lastNamel;
	}

	public double getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}
}
