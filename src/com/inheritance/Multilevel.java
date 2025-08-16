package com.inheritance;

class Employee{
	int eid;
	String ename;
	
}

class Devloper extends Employee
{
	int salary;
	public void showDevloper()
	{
		System.out.println("Id Is : "+eid);
		System.out.println("Name is : "+ename);
		System.out.println("Salary is : "+salary);
	}
}

class Manager extends Devloper
{
	int teamsize ;
	public void showManager()
	{
		System.out.println("Id Is : "+eid);
		System.out.println("Name is : "+ename);
		System.out.println("Team Size is : "+teamsize);
		System.out.println("Salary is : "+salary);
		
	}
}
public class Multilevel {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.eid=101;
		m.ename = "Asd";
		m.teamsize =
				10 ;
		m.salary = 89234;
		
		System.out.println("Manager Data..");
		m.showManager();
		
		System.out.println();
		
		Devloper d =new Devloper();
		d.eid = 102;
		d.ename = "Xyz";
		d.salary =45890;
		
		System.out.println("Employee Data..");
		d.showDevloper();

	}

}
