package com.arrayex;

import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc =new Scanner(System.in);
		int i;
		System.out.println("Enter element's on array...");
		
		for(i =0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array is...");
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
