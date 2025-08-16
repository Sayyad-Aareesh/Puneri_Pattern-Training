package com.abstracction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculation c;
		Scanner sc =new Scanner(System.in);
		
		do {	
			System.out.println("1].CircleShape");
			System.out.println("2].TriangleShape");
		
		System.out.println("Enter Your Choice...");
		int ch=sc.nextInt();
				
		switch(ch)
		{
		case 1 :
				c = new CircleShape();
				c.cal_area();
				c.cal_circumference();
				break;
		
		case 2 :
				c=new TriangleShape();
				c.cal_area();
				c.cal_circumference();
				break;
				
		default: 
				System.out.println("Please Enter Valid Choice..");
		}

	}while(true);
		
	}


}
