package com.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferRead {

	public static void main(String[] args) throws IOException {
		InputStreamReader i = new InputStreamReader(System.in); 
		
		BufferedReader br =new BufferedReader(i);
		System.out.println("Enter Num 1 : ");
		
		String num1 =br.readLine();
		
		System.out.println("Enter Num 2 : ");
		String num2 =br.readLine();
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		System.out.println("Addtion of nuum1 + num2 is : "+(num1+num2));
		System.out.println("Addtion of n1 + n2 is : "+(n1+n2));
		
		
		

	}

}
