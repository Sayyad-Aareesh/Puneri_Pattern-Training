package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListStudComparator {

	public static void main(String[] args) {
		StudentComparator s = new StudentComparator(1 ,"AAAA","Pune",89.90,21);
		List<StudentComparator> slist = new ArrayList<StudentComparator>();
		
		slist.add(s);
		slist.add(new StudentComparator(2 , "BBBB", "Nasik", 79.90,20));
		slist.add(new StudentComparator(3 , "CCCC", "Jalna", 88.03,19));
		System.out.println("Before Sorting...");
		System.out.println();
		for( StudentComparator s1 : slist)
		{
			System.out.println(s1);
		}
		System.out.println();
//		//AgeSorting Class
//		Collections.sort(slist ,new AgeSorting());
//		System.out.println("After Sorting By Age : ");
//		for( StudentComparator s1 : slist)
//		{
//			System.out.println(s1);
//		}
//	

//		//NameSorting Class
//		Collections.sort(slist ,new NameSorting());
//		System.out.println("After Sorting By Age : ");
//		for( StudentComparator s1 : slist)
//		{
//			System.out.println(s1);
//		}
		
		//PerSorting Class
		Collections.sort(slist ,new PerSorting());
		System.out.println("After Sorting By Age : ");
		for( StudentComparator s1 : slist)
		{
			System.out.println(s1);
		}

	


	}

}
