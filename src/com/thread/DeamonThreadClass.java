package com.thread;

public class DeamonThreadClass implements Runnable{


	@Override
	public void run() 
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(Thread.currentThread().getName()+" is Daemon Thread..."+" Priority is :"+Thread . currentThread() .getPriority());
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" is Not Daemon Thread..."+" Priority is :"+Thread . currentThread() .getPriority());
		}
		
	}
	
	public static void main(String[] args) 
	{
		DeamonThreadClass d =new DeamonThreadClass();
		Thread t1 = new Thread(d,"t1");
		Thread t2 = new Thread(d,"t2");
		Thread t3 = new Thread(d,"t3");
		
		t1.setDaemon(true);			//Daemon Thread
		t3.setDaemon(false); 		//user Thread
		
	//	t2.setPriority(Thread.MAX_PRIORITY);
	//t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
