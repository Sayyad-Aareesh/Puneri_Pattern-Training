package com.wrapper_classes;

public class ObjectClassEx {

	public static void main(String[] args) {
		String s = "java";
		System.out.println("Class name :"+s.getClass());
		
		DateClassEx d= new DateClassEx();
		System.out.println("Class name :"+d.getClass());
		
		//jvm generate hash-code automatically ...
		System.out.println("Generate hashcode for date class : "+d.hashCode());
		System.out.println("Generate hashcode for String s : "+s.hashCode());
		

	}

}
