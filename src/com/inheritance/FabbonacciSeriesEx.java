package com.inheritance;

public class FabbonacciSeriesEx {

	public static void main(String[] args) {
		//addition of last two digits is equals to the next digit
		//0,1,1,2,3,5,8,13,...
		
		int num1 =0;
		int num2 = 1; 
		int f = 0;
		
		System.out.println("First Number is : "+num1);
		System.out.println("Second Number s : "+num2);
		
		for (int i=0 ;i <= 10;i++)
		{
			f=num1+num2;
			System.out.println(f); 		//o/p=3
			
			num1 = num2 ;
			num2 =f ;
		}

	}

}
