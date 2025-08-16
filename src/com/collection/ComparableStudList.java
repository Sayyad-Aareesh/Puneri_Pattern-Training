package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableStudList {

	public static void main(String[] args) {
		StudentComparabble s = new StudentComparabble(1 ,"AAAA","Pune",89.90,21);
		List<StudentComparabble> slist = new ArrayList<StudentComparabble>();
		
		slist.add(s);
		slist.add(new StudentComparabble(2 , "BBBB", "Nasik", 79.90,20));
		slist.add(new StudentComparabble(3 , "CCCC", "Jalna", 88.03,19));
		System.out.println("Before Sorting...");
		System.out.println();
		for( StudentComparabble s1 : slist)
		{
			System.out.println(s1);
		}
		System.out.println();
		
		Collections.sort(slist);
		System.out.println("After Sorting : ");
		for( StudentComparabble s1 : slist)
		{
			System.out.println(s1);
		}
		

	}

}
