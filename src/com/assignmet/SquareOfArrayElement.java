package com.assignmet;

import java.util.Scanner;

public class SquareOfArrayElement {

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
		
		System.out.print("Elements on array are : ");
		for(i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ,");
		}
		
		System.out.println();
		System.out.print("Square of Array elements are : ");
		
		for(i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]*arr[i]+" , ");
		}

	}

}
