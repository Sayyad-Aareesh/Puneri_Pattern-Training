package com.flowcontrolStatement;

import java.util.Scanner;

public class DowhileEx {

	public static void main(String[] args)
	{
		int i = 1;
		//print the number from 1 to 10.
//		do {
//			++i;
//			
//			System.out.println(i);
//			
//		}
//		while(i<=10);

		//To take the number from user which is less then 100.
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Enter the number (less then or equal to) <= 100");
			num = sc.nextInt();
		}while(num <= 100);
		System.out.println("Sorry number "+num+" is gretter then 100");
	}
}
