package com.sync;

public class PrintTable {

	//synchronized method
	public synchronized void print(int num)
	{
		//Synchronized block
//		Synchronized(this)
//		{
//			
//			for(int i = 1; i<= 10 ;i++)
//			{
//				System.out.println(i*num);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
			
			
			for(int i = 1; i<= 10 ;i++)
			{
				System.out.println(i*num);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	
	public static void main(String[] args) {
		
		PrintTable p = new PrintTable();
		p.print(5);
	}
}
