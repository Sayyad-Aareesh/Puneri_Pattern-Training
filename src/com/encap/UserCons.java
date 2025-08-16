package com.encap;

public class UserCons 
{
	private int uid;
	private String uname;
	private String upassword;
	public UserCons(int uid, String uname, String upassword) 
	{
		
		this.uid = uid;
		this.uname = uname;
		this.upassword = upassword;
	}
	public int getUid() {
		return uid;
	}
	public String getUname() {
		return uname;
	}
	public String getUpassword() {
		return upassword;
	}
	
	

}
