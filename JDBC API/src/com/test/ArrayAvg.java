package com.test;

public class ArrayAvg {

	public static void main(String[] args) {
		int arr[] = {10,20,2,33,4};
		int avg=0;
		for(int i=0;i < arr.length;i++)
		{
			 avg +=arr[i]/5;
			
			 System.out.println("Average of integer array is : " +avg);
		}
		

	}

}
