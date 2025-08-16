package com.encap;

public class ProtectedDemo {

	public static void main(String[] args) {
		ProtectedAM p =new ProtectedAM();
		System.out.println(p.a);		//inside the package it is accessible
		p.show();
	}

}
