package com.assignmet;

import java.util.Scanner;

public class SearchZeroOnArray {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Scanner sc =new Scanner(System.in);
		int i;
		int add=0;
		String searchzero="Zero Not Found";
		
		System.out.println("Program to search zero in array..");
		
		System.out.println("Enter element's to the  array...");
		
		for(i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Elements in array are");
		for(i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(i =0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				searchzero="Zero Found";
			}
		}
		System.out.println(searchzero);
		
	}

}
