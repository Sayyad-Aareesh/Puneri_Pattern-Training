package com.arrayex;

import java.util.Scanner;

public class SearchArrayElement {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc =new Scanner(System.in);
		int i;
		int searchelement;
		System.out.println("Enter element's on array...");
		
		for(i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Elements on array are");
		for(i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter the number to serach in array");
		searchelement =sc.nextInt();
		
		String result = "Not Found";
		for(i =0;i<arr.length;i++)
		{
			if(arr[i]==searchelement)
			{
				result="Found";
			}
		}
		System.out.println(result);
		

	}

}
