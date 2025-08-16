package com.collection;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ScannerExample {

	 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> s = new LinkedHashSet<Integer>();
		
		int n ,i;
		System.out.println("How many Elements's you want to store in LinkedList : ");
		n = sc.nextInt();
		//System.out.println("Enter "+n +"Elements :");
		for(i =1 ;i<=n ;i++)
		{
			System.out.println("Enter " +i +" Element");
			s.add(sc.nextInt());
		}
		sc.close();
		System.out.println("Entered Elements are : ");
		Iterator<Integer> itr =s.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	
		//System.out.println(s);
	}

}
