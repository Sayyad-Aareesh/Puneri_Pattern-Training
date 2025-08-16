package com.thread;

public class ThreadClass extends Thread
{

	public void run() 			//3) running
	{
		System.out.println("This is thread class");
	}
	public static void main(String[] args)
	{
		ThreadClass t = new ThreadClass(); //1) new State
	//	t.run();		//regular method
		
		t.start(); //call run method		//2) runnable
		
		System.out.println("Thread Desrtoyed"); 		//4) destroy
	}

}
