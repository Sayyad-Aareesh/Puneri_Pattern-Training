package com.assignmet;

import java.util.Scanner;

public class ArrayElementAddititon {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc =new Scanner(System.in);
		int i;
		int add=0;
		
		System.out.println("Program to print addition of all elements of an array..");
		
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
		
		//"Addition in array are;
		for(i =0;i<arr.length;i++)
		{
			//add +=arr[i];
			add=add+arr[i];
		}
		System.out.println("Addition of Array Elements : "+add);
		

	}

}
