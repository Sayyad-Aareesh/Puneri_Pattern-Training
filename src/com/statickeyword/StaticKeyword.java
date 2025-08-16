package com.statickeyword;

public class StaticKeyword {
	int id;
	String name;
	static String course ="FS-java";
	public StaticKeyword(int sid,String sname)
	{
		this.id = sid;
		this.name = sname;
		
	}

	public void showDetails()
	{
		System.out.println("Id is : "+id);
		System.out.println("Name is : "+name);
		System.out.println("Course is : "+course);
	}
	
	//static block
	static
	{
		System.out.println("This is Static block...");
	}
	public static void main(String[] args) {
		StaticKeyword s1 = new StaticKeyword(1,"abc");
		StaticKeyword s2 = new StaticKeyword(2,"efg");
		
		s1.showDetails();
		s2.showDetails();
		
		course = "FS-Pythone";
		StaticKeyword s3 = new StaticKeyword(3,"xyz");
		s3.showDetails();

	}

}
