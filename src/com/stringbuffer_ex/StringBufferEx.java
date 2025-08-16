package com.stringbuffer_ex;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Java Language");
		StringBuffer sb1=new StringBuffer("String Buffer Ex");
		//StringBuffer b ="Hello Coders"; //literal method
		System.out.println("StringBuffer Example...");
		System.out.println();
		System.out.println("String sb is : "+sb);
		
		sb.insert(5, "Programming ");
		System.out.println("After inserting 'programming ' using insert()in string sb is : "+sb);
		
		System.out.println();
		System.out.println("Repeat sb three times by using repeat method is : ");
		System.out.println( sb.repeat(sb, 3));
		
		System.out.println("String sb 1 is :"+sb1);
		System.out.println("replace sub-part of String sb1 by using replace method : ");
		System.out.println(sb1.replace(14,16 , "Example"));
		
		System.out.println("Print sub part of String sb 1 by using substring() method :"+sb1.substring(7));
		System.out.println("Only pring Buffer from sb 1 by using substrint(int ,int) method :"+sb1.substring(7, 14));
		
		System.out.println("print the string sb1 in Reverse order  by using reverse() method : "+sb1.reverse());
	}

}
