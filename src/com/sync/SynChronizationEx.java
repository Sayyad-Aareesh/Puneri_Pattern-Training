package com.sync;
class Child1 extends Thread
{
	PrintTable p;

	public Child1(PrintTable p) {
		this.p = p;
	}
	public void run()
	{
		p.print(5);
	}
	
}

class Child2 extends Thread
{
	PrintTable p;

	public Child2(PrintTable p) {
		this.p = p;
	}
	public void run()
	{
		p.print(7);
	}
	
}

class Child3 extends Thread
{
	PrintTable p;

	public Child3(PrintTable p) {
		this.p = p;
	}
	public void run()
	{
		p.print(9);
	}
	
}
class Child4 extends Thread
{
	PrintTable p;

	public Child4(PrintTable p) {
		this.p = p;
	}
	public void run()
	{
		p.print(8);
	}
	
}
public class SynChronizationEx {

	public static void main(String[] args) {
		PrintTable p = new PrintTable();
		Child1 c1= new Child1(p);
		Child2 c2= new Child2(p);
		Child3 c3= new Child3(p);
		Child4 c4= new Child4(p);
		
		c1.setName("t1");
		c2.setName("t2");
		c3.setName("t3");
		c4.setName("t4");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
	}

}
