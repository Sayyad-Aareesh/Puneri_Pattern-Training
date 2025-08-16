package com.thread;


public class YieldAndJoinEx implements  Runnable {
	public void run() 
	{
		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		YieldAndJoinEx yj = new YieldAndJoinEx();
		Thread t1 = new Thread(yj,"t1");
		Thread t2 = new Thread(yj,"t2");
		Thread t3 = new Thread(yj,"t3");
		Thread t4 = new Thread(yj,"t4");
		
		
		t1.start();
		
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	//	t1.join();
		
		t1.yield();
		
		t2.start();
		t3.start();
		t4.start();
		
	}

}
