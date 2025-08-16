package com.abstracction;

public class TriangleShape extends Calculation{

	@Override
	public void cal_area() {
		System.out.println("Enter l ,b : ");
		int l=sc.nextInt();
		int b=sc.nextInt();
		
		ans=0.5*l*b;
		
		System.out.println("Area of Triangle is :"+ans);
		
		
	}

	@Override
	public void cal_circumference() {
		System.out.println("Enter Side A  : ");
		int a=sc.nextInt();
		
		System.out.println("Enter base(B) : ");
		int b=sc.nextInt();
		
		System.out.println("Enter Side C");
		int c= sc.nextInt();
		
		System.out.println("Triangle Cicumference is : "+ans);
		
	}

}
