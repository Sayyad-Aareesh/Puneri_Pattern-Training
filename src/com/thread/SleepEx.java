package com.thread;

public class SleepEx  extends Thread 
{
	public void run()
	{
		for(int i= 1; i<=3 ;i++)
		{
			System.out.println("Thread "+Thread.currentThread().getName()+" complete : "+i+" iteration ");
		
			try {
			Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
			
			e.printStackTrace();
			}
		
		}
	}
	
	public static void main(String[] args)
	{
		SleepEx s1 =new SleepEx();
		SleepEx s2 =new SleepEx();
		SleepEx s3 =new SleepEx();
		SleepEx s4 =new SleepEx();
		
		s1.setName("t1");
		s2.setName("t2");
		s3.setName("t3");
		s4.setName("t4");
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}

}
