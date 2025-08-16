package com.inheritance;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
		int num,cnt=0 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number...");
		num=sc.nextInt();
		
		for(int i =0;i<num;i++)
		{
			if(num%i==0)
			{
				cnt++;
			}
		}
		
		if(cnt==2)
		{
			System.out.println("Prime Number...");
		}
		else {
			System.out.println("Not Prime..");
		}

	}

}
