package com.classanobject;

import java.util.Scanner;

public class Student {
	int rollNo;
	String name;
	String address;
	double per;
	
	public void acceptDeatils()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll_No : ");
		rollNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		
		name = sc.nextLine();
		
		System.out.println("Enter Address : ");
		//address = sc.next(); 			//it take one first word from the sentence.
		//sc.nextLine();
		address = sc.nextLine();			//it take entire sentence.or line 
		
		System.out.println("Enter Per : ");
		per = sc.nextDouble();
		
		
	}
	
	public void showDetails()
	{
		System.out.println("Roll No is : "+rollNo);
		System.out.println("Name is : "+name);
		System.out.println("Address is : "+address);
		System.out.println("Per is : "+per);
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		s.acceptDeatils();
		s.showDetails();
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		
		Student s1 = new Student();
		s1.acceptDeatils();
		s1.showDetails();
		

	}

}
