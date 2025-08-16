package com.encap;

public class UserSetterGetterDemo {

	public static void main(String[] args) {
		UserSetterGetter u = new UserSetterGetter();
		
		//To set the value of user 
		u.setUid(1);
		u.setUname("Sayyad");
		u.setUpassword("sayyad123");
		
		//to get the user value
		System.out.println("User id is : "+u.getUid());
		System.out.println("User name is : "+u.getUname());
		System.out.println("User Password is : "+u.getUpassword());

	}

}
