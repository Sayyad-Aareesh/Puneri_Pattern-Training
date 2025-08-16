package com.basic;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		int num1,num2,ans;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		num1=sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		num2=sc.nextInt();
		
		ans =num1+num2;
		
		System.out.println("Addition is :"+ans);
		sc.close();
		
	}

}
