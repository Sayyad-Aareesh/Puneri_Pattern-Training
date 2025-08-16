package com.flowcontrolStatement;

import java.util.Scanner;

public class NestedIfElse {
	int num;
	Scanner sc =new Scanner(System.in);

			public void checkNestedIfElse()
			{
				System.out.println("Enter any Number...");
				num =sc.nextInt();
				
				if(num == 0 )
				{
					System.out.println(" Number is Zero");
				}
				else
				{
					if(num > 0)
					{
						System.out.println(num+" is positive");
					}
					else
					{
					System.out.println(num+" is Negetive");
					}  //inner else close
				
				}   //outer else close 
				
			}  //method close

			
			public static void main(String[] args) {
				NestedIfElse obj =new NestedIfElse();
				obj.checkNestedIfElse();
			}

}
