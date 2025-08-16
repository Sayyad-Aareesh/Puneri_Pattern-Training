package com.flowcontrolStatement;

import java.util.Scanner;

public class IfElseExample {
int num;
Scanner sc =new Scanner(System.in);

		public void checkIfElse()
		{
			System.out.println("Enter any non-zero Number...");
			num =sc.nextInt();
			
			if(num > 0 )
			{
				System.out.println(num+" is positive");
			}
			else
			{
				System.out.println(num+" is Negetive");
			}
		}
		
		public static void main(String[] args) {
			System.out.println("Program to check the number is positive or negetive");
			IfElseExample obj =new IfElseExample();
			
			obj.checkIfElse();
		}

}
