package com.test;

public class UserData {

	private int id;
	private String uname;
	private String uemail;
	private String age;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public static void main(String[] args) {
		

	}
	
	
	@Override
	public String toString() {
		return "UserData [id=" + id + ", uname=" + uname + ", uemail=" + uemail + ", age=" + age + "]";
	}

}
