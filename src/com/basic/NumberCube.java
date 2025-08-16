package com.basic;

import java.util.Scanner;

public class NumberCube {
	public static void main(String[] args) {
		int num,cube;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Program to calculate Cube of Number...");
		System.out.println();
		
		
		System.out.println("Enter the Number : ");
		num =sc.nextInt();
		
		cube =num*num*num;
		
		System.out.println("Cube of Number is : "+cube);
		
		sc.close();
		
	}

}
