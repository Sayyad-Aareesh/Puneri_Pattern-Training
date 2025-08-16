package com.arrayex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) 
	{
		int arr[] = new int[5];
		Scanner sc =new Scanner(System.in);
		int i;
		System.out.println("Enter element's on array...");
		
		for(i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//Sort Array in Ascending order
		Arrays.sort(arr);

		System.out.println("After Sorting...");
		for(i = 0 ;i < arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
		//smallest element in array is
		System.out.println("Smallest element in array is  : "+arr[0]);

		//largest element in array is
		System.out.println("Largest element in array is  : "+arr[arr.length-1]);
		
		
		System.out.println("Print array in descending order...");
		for(i=arr.length-1;i >=0 ; i--)
		{
			System.out.println(arr[i]);
		}
	}

}
