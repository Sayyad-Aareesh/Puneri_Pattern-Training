package com.thread;

public class RunnableClass implements Runnable {

	@Override
	public void run() //t1 and t2 in running state
	{
	
		System.out.println("Thread is Running through Runnable Interface");
		
	}
	
	public static void main(String[] args) {
		
		RunnableClass r = new RunnableClass();
		
		Thread t1 = new Thread(r);	//new state
		Thread t2 = new Thread(r);	//new state
		
		t1.start();		//t1 in runnable state
		t2.start(); 	//t2 in runnable state
		
		System.out.println(); 		//destroyed state

	}

	

}
