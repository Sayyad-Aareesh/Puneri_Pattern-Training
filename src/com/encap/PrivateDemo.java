package com.encap;

public class PrivateDemo {

	public static void main(String[] args) {
		PrivateAm p = new PrivateAm();
		
		//System.out.println("Value of A in the main of Private Demo out side the class"
		//		+ "by using object is : "+p.a);  
		
		//show error : because if we declare any variable 
		//as private it is accessible within a class only 
		
		p.showData();
	}

}
