package com.encap2;

import com.encap.ProtectedAM;

public class ProtectedDemo2 extends ProtectedAM  {

	public static void main(String[] args) {
		//ProtectedAM p =new ProtectedAM();
		//System.out.println(p.a);		//error:can not access outside the package
		//p.show();			//because it is public method it is accessible any where. 
		
		ProtectedDemo2 d = new ProtectedDemo2();
		System.out.println("out sode the package thorugh child class 'value of a is' : "+d.a);
		d.show();
	}

}
