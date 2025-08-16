package com.basic;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		int num,square;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Program to calculate Square of Number...");
		System.out.println();
		
		
		System.out.println("Enter the Number : ");
		num =sc.nextInt();
		
		square =num*num;
		
		System.out.println("Square of Number is"+square);
		
		sc.close();
		
	}
}
