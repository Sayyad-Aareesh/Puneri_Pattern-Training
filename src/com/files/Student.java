package com.files;

import java.io.Serializable;

public class Student implements Serializable 
{
	private int eid;
	private String ename;
	private String address;
	private double per;
	
	public Student(int eid, String ename, String address, double per) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
		this.per = per;
	}
	
	@Override
	public String toString() {
		return "Student [eid=" + eid + ", ename=" + ename + ", address=" + address + ", per=" + per + "]";
	}
	

}
