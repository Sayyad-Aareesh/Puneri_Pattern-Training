package com.interf_examples;

interface A
{
	int a=20;			//public,static,final,
	void showMsg();		//public and abstract 
	default void showA()
	{
		System.out.println("Value of a is : "+a);
		increaseA();
	}
	private void increaseA()
	{
		//a++			//final field can not be changed.
		System.out.println("After increase A is : "+(a+1));
	}
	
	static void  sMethod()
	{
		System.out.println("This is Static Method..");
	}
	
}
public class Demo implements A{

	@Override
	public void showMsg() {
	
		System.out.println("This is Overrided Method : ");
		
	}
	
	public static void main(String[] args) {
		Demo d =new Demo();
		d.showA();
		d.showMsg();
		
		System.out.println("Value of A is : "+A.a);
		A.sMethod();
		

	}

	

}
