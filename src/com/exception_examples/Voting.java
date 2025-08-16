package com.exception_examples;

import java.util.Scanner;

public class Voting 
{
	public static void main(String[] args) throws AgeException {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Age...");
		int age = sc.nextInt();
		
		if(age >=18 && age <= 150)
		{
			System.out.println("Congratulation....You can vote...");
		}
		else
		{
			throw new AgeException("Sorry...You are not Eligible to Vote...");
		}
		
		
	}

}
