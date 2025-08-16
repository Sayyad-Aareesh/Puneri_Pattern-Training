package com.interf_examples;

public class ChildClass implements Parent1,Parent2  {

	@Override
	public void showMsg() {
		
		//Parent1.super.showMsg();
		
		System.out.println("This is an Examle of Multiple Inheritance using Interface");
	}
	
	public static void main(String[] args) {
		ChildClass c =new ChildClass();
		c.showMsg();

	}

	

}
