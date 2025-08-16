package com.encap2;

import com.encap.DefaultAM;

public class DefaultDemo2 {

	

	public static void main(String[] args) {
	DefaultAM d = new DefaultAM();
	
	//System.out.println("Value of a is : "+d.a);
	//show error :Default cannot be accessible outside the package.
	
	//but through the method of that class it is accessible
	d.show();
	}

}
