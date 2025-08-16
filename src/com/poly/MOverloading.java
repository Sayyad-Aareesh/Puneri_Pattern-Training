package com.poly;

public class MOverloading {

	public void showMsg()
	{
		System.out.println("This is showMsg Method-1");
	}
	
	public void showMsg(String msg)
	{
		System.out.println("This is showMsg Method-2");
	}
	
	public void showMsg(int msg)
	{
		System.out.println("This is showMsg Method-3");
	}
	
	public static void main(String[] args) {
		
		MOverloading m = new MOverloading();
		m.showMsg();
		m.showMsg(23);
		m.showMsg("asdf");

	}

}
