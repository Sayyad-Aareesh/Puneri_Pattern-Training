package com.wrapper_classes;

import java.util.Date;

public class DateClassEx {

	public static void main(String[] args) {
		Date d =new Date();
		System.out.println("Current Date is : "+d);
		System.out.println();
		System.out.println("Display only Date : "+d.getDate());
		System.out.println("Display only  Month : "+d.getMonth());
		System.out.println("Display only Day : "+d.getDay());
		System.out.println("Display only Minute : "+d.getMinutes());
		System.out.println("Display only Time : "+d.getTime()); //It Display current time in long formate
		System.out.println("Display  Date/mont/year, time :minute:sec : "+d.toLocaleString());
		
	}

}
