package com.assignmet;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Square {
	int n;
	Scanner sc = new Scanner(System.in);
	
	public void squre()
	{
		System.out.println("How many number you squre.. ");
		n =sc.nextInt();
		for(int i = 1 ;i<=n ;i++)
		{
			System.out.print(i*i+" ,");
		}
		System.out.print("...");
	}
			
	public static void main(String[] args) {
		
		Square s = new Square();
		s.squre();
	}
}
