package com.encap;

import java.util.Scanner;

public class UserSetterGetterUsingScanner {

	UserSetterGetter u ;
	Scanner sc = new Scanner(System.in);
	public void setUserData()
	{
		System.out.println("Enter the user id :");
		int id=sc.nextInt();
		u.setUid(id);
		
		System.out.println("Enter the user Name :");
		String name=sc.next();
		u.setUname(name);
		
		System.out.println("Enter the user passwor :");
		String pass=sc.next();
		u.setUpassword(pass);
		
		
	}
	
	public void getUserData()
	{
		System.out.println("USer id : "+u.getUid());
		System.out.println("User name is : "+u.getUname());
		System.out.println("Uase Password is : "+u.getUpassword());
	}
			
	
	public static void main(String[] args) {
		
		UserSetterGetterUsingScanner us = new UserSetterGetterUsingScanner();
		us.setUserData();
		us.getUserData();
	}

}
