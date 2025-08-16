package com.exception_examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1 , num2 ;
		int div=0;
		try {
			System.out.println("Enter First Number : ");
			num1 = sc.nextInt();
			
			System.out.println("Enter Second number : ");
			num2 = sc.nextInt();
			div=num1 / num2 ; 
			System.out.println("Division is : "+div);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			 //System.out.println("Something want's to wrong ,please try again...");
			System.out.println("Division is : "+div);
			
		}
		System.out.println("Rest of the code... ");

	}

}
