package com.encap;

public class UserConsDemo {

	public static void main(String[] args) {
		
		UserCons u = new UserCons(1,"Aareesh", "aareesh@123");
		System.out.println("User id : "+u.getUid());
		System.out.println("User name : "+u.getUname());
		System.out.println("User Password : "+u.getUpassword());
		
		System.out.println();
		
		UserCons u1 = new UserCons(2,"Sayyad", "sayyad@123");
		System.out.println("User id : "+u1.getUid());
		System.out.println("User name : "+u1.getUname());
		System.out.println("User Password : "+u1.getUpassword());
		
	}

}
