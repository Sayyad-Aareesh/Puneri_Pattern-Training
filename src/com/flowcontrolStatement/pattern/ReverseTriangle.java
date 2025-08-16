package com.flowcontrolStatement.pattern;

import java.util.Scanner;

public class ReverseTriangle {
	public static void main(String[] args) 
	{
//		int i,j,k;
//		for( i=1 ;i<=10 ;i++)
//		{
//			for(j=1;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(k=i ;k<=10;k++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	
		
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Reverse triangle of star(*)");
		System.out.println("How many row's you want..?");
		int row =sc.nextInt();
		for( i=1 ;i<=row ;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=i ;k<=row;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
