package com.flowcontrolStatement;

import java.util.Iterator;
import java.util.Scanner;

public class ForLoopEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//print the hello java 10 times
//		for (int i = 0; i < 10; i++) 
//		{
//			System.out.println("Hello Java");
//	
//		}
		
//		program to print the value of i ,start from num1 value and end on num2
//		int num1=10,num2=20;
//		
//		for(int i=num1 ; i<=num2 ; i++)
//		{
//			System.out.println(i);
//		}
		
		//To print the addition of n natural numbers
//		System.out.println("Enter the the number to perform addtion of natural number");
//		int num =sc.nextInt();
//		long temp=0;
//		for(int i =1 ;i<=num ;i++) {
//			//temp+= i;
//			
//			temp=temp+i;
//			System.out.println("Value of temp : "+temp);
//		}
//		
//		System.out.println("Addition of "+num+" natural number is : "+temp);
//		
	
	//program to print 1 to 100 even numbers;
		
		for(int i=1 ; i<=100 ;i++)
		{
		
			if(i %2 ==0)
			{
				System.out.println(i);
			}
		}
	}

	
}
