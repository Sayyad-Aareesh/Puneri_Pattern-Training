package com.flowcontrolStatement;

public class WhileLoopEx {

	public static void main(String[] args) {
		int n=10;
		int i=1;
		//print the value of i from 1 to n or 10.
//		while(i<=n)
//		{
//			System.out.println(i);
//			i++;
//		}
		
		//print the even number from 1 to 10
//		while( i <= n )
//		{
//			if(i %2 ==0)
//			{
//				System.out.println(i);
//			}
//			i++;
//		}
		
		//print the table of 5
//		int table=5;
//		while(i <= 10)
//		{
//			System.out.println(i*table);
//			i++;
//		}
		
		//Calculate factorial of number or 20.(1,2,4,5,10,20).
		//the number is completely divide by another number
		int fact = 20;
		while( i<fact)
		{
			if( fact %i==0)
			{
				System.out.println(i);
			}
			i++;
		}
		
		

	}

}
