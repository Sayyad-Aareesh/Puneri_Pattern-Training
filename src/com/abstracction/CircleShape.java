package com.abstracction;

public class CircleShape extends Calculation{

	public void cal_area() {
		System.out.println("Enter Radius...");
		int r=sc.nextInt();
		ans=3.142*(r*r);
		System.out.println("Area of Circle : "+ans);
		
	}

	public void cal_circumference() {
		System.out.println("Enter Radius");
		int r = sc.nextInt();
		ans = (2*3.142)*r;
		System.out.println("Corcumference of Circle : "+ans);
		
	}

}
