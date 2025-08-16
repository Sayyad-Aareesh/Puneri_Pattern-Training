package com.exception_examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
	public static void main(String[] args)
	{
//		int a[] = new int[3];
//		//finally with try Block
//		try {
//			System.out.println(a[3]);	
//		}
//		finally
//		{
//			System.out.println("This is finally block...");
//		}
		int n=0;
		Scanner sc =new Scanner(System.in);
		try {
		System.out.println("Enter the Number : ");
		n =sc.nextInt();
				
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Entered Number is : "+n);
		}
		
		
	}

}
