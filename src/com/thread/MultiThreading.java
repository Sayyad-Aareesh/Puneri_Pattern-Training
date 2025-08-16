package com.thread;

public class MultiThreading implements Runnable{

	public void run() 
	{
		for(int i =1 ; i<= 10 ; i++)
		{
			System.out.println(Thread . currentThread() .getName()+" : "+i);
		}
		
	}

	public static void main(String[] args)
	{
		MultiThreading m = new MultiThreading();
		Thread t1 = new Thread(m);
		Thread t2 =new Thread(m);
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();
	}

	
}
