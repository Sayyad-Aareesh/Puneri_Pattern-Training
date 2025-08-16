package com.assignmet;

import java.util.Scanner;

public class AlpbhabetsConverter {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Any Character...");
	char ch = sc.next().charAt(0);
	char newchar;
	if(ch >='A' && ch<='Z' )
	{
		newchar=(char) (ch+32);
		System.out.println("Small Case latter is :"+newchar);
		
	}
	else if(ch >='a' && ch<='z' ) 
	{
		newchar=(char) (ch-32);
		System.out.println("Capital Case latter is :"+newchar);
		
	}
	else
	{
		System.out.println("Entered Character is Digit or Special Symbol...");
	}
	}
}
