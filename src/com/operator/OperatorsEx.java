package com.operator;

import java.util.Scanner;

public class OperatorsEx {
	int a,b;
	Scanner sc = new Scanner(System.in);
	
	
	public void arithmeticOpreators() {
		System.out.println("Enter First Number : ");
		a=sc.nextInt();
		System.out.println("Enter Second Number : ");
		b = sc.nextInt();
		
		int add = a+b;
		System.out.println("Addition is : "+add);
		
		int sub = a-b;
		System.out.println("Subtraction is : "+sub);
		
		int mul =a*b;
		System.out.println("Multiplication is : "+mul);
		
		int div = a/b;
		System.out.println("Division is : "+div);
		
		int reminder = a%b ;
		System.out.println("Mod is : "+reminder);
	}

	public static void main(String[] args) {
		OperatorsEx o =new OperatorsEx();
		o.arithmeticOpreators();

	}

}
