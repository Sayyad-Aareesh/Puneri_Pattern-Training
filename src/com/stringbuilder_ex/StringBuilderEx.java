package com.stringbuilder_ex;

public class StringBuilderEx {

	public static void main(String[] args) {
		//StringBuilder s1="String Builder";
		StringBuilder s =new StringBuilder("This is also String");
		StringBuilder s1 =new StringBuilder("String Builder Example");
		System.out.println("String Builder Example...");
		System.out.println();
		System.out.println("String Builder s1 is : "+s1);
		System.out.println("String Builder s is : "+s);
		
		System.out.println("length of Sting s is : "+s.length());
		
		System.out.println("length of Sting s1 is : "+s1.length());
		s.insert(12, " immutable ");
		System.out.println("After inserting 'immutable ' using insert()in string s  is : "+s);
		
		
		System.out.println();
		
		System.out.println("String s1  is :"+s1);
		System.out.println("replace sub-part of String s1 by using replace method : ");
		System.out.println(s1.replace(14,22 ," Ex"));
		
		System.out.println();
		
		System.out.println("Print sub part of String s1 by using substring() method :"+s1.substring(7));
		System.out.println();
		
	System.out.println("Only print Builder from s1 by using substrint(int ,int) method :"+s1.substring(7,14));
		System.out.println();
		
		System.out.println("print the string s1 in Reverse order  by using reverse() method : "+s1.reverse());


		System.out.println();
		System.out.println("Repeat s1 three times by using repeat() method is : ");
		System.out.println( s1.repeat(s1, 3));
		
	}

}
