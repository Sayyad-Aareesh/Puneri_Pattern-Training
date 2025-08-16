package com.encap;

public class PrivateAm {

	private int a=20; //
	public void showData()
	{
		System.out.println("In showData Method Value of A is :"+a);
	}
	public static void main(String[] args) {
		PrivateAm p = new PrivateAm();
		System.out.println("Value of p in main-method is : "+p.a);

	p.showData();
	}
	

}
