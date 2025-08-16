package com.basic;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n ;
		double d;
		float f;
		char c;
		String word;
		String sentence;
		
		System.out.println("Enter integer Number : ");
		n =sc.nextInt();
		
		System.out.println("Enter Double Number : ");
		d =sc.nextDouble();
		
		System.out.println("Enter Float Number : ");
		f =sc.nextFloat();
		
		System.out.println("Enter word : ");
		word =sc.next();
				
		System.out.println("Enter Char : ");
		c =sc.next().charAt(0);
		
		System.out.println("Enter Scentence : ");
		sentence =sc.nextLine();
		
		System.out.println("Your Entered Number is : "+n);
		System.out.println("Your Entered Double Number is : "+d);
		System.out.println("Your Entered Float Number is : "+f);
		System.out.println("Your Entered Charecter is : "+c);
		System.out.println("Your Entered Word is : "+word);
		System.out.println("Your Entered Sentence is : "+sentence);
		
		
		sc.close();
		
		
		
		

	}

}
