package com.thread;

public class IsAliveEx implements Runnable {

	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().isAlive() );
	}
	
	public static void main(String[] args) throws Exception 
	{
		IsAliveEx i = new IsAliveEx();
		Thread t1 = new Thread(i,"t1");
		System.out.println("Before start : "+ t1.isAlive());
		t1.start(); 		//active => isAlive=true
		t1.join();
		System.out.println("After run : "+t1.isAlive());
	}

}
