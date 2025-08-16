package com.thread;

public class PriorityThreadClass implements Runnable {
	public void run()
	{
		for(int i=1 ;i<=3 ;i++)
		{
			System.out.println("Thread name"+Thread . currentThread() .getName()+" : "+i +" Priority is :"+Thread . currentThread() .getPriority());
		}
			
	}
	public static void main(String[] args)
	{
		PriorityThreadClass p =new PriorityThreadClass();
		Thread t1 = new Thread(p , "t1");
		Thread t2 = new Thread(p , "t2");
		Thread t3 = new Thread(p ,"t3");
		//t1.setPriority(9);
		t3.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		
		
	}

}
