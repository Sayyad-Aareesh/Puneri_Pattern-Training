package com.wrapper_classes;

import java.util.Scanner;

public class MathsEx {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1 ;
		int num2 ;
		
		System.out.println("Enter First Number : ");
		num1=sc.nextInt();
		
		System.out.println("Enter Second number : ");
		num2 =sc . nextInt();
		System.out.println("First Number :"+num1 +" and Second number : "+num2);
		System.out.println("Largest number between num1 and num2 : "+Math.max(num1, num2));

		System.out.println("Small number between num1 and num2 "+Math.min(num1, num2));
		
		System.out.println("Square root of num1 is : "+Math.sqrt(num1));
		
		System.out.println("num1 to the Power num2   : "+Math.pow(num1, num2));
		
		
		

	}

}
