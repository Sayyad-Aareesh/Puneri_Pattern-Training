package com.test;

public class FabannciEx {

	public static void main(String[] args) {
		int n1=0,n2=1;
		
		System.out.println("Value of n1 : "+n1);
		System.out.println("Value of n2 : "+n2);
		for(int i=0;i<=10;i++)
		{
			int f=0;
			f=n1+n2;
			
			System.out.print(" "+f);
			
			n1=n2;
			n2=f;
			
			
		}

	}

}
