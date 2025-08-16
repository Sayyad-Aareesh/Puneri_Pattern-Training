package com.collection;
import  java.util.*;

public class TreeSetEx {
	public static void main(String[] args) {
	
		SortedSet<Integer> ts = new TreeSet<Integer>();
		ts.add(70);
		ts.add(23);
		ts.add(90);
		ts.add(50);
		ts.add(25);
		
		System.out.println("Tree-Set 1 : "+ts);
		
	//	ts.addFirst(11);		//Not Support
	//	ts.addLast(100);		//Not Support
		
		System.out.println("Size of Tree-Set : "+ts);
		System.out.println("isEmpty : "+ts.isEmpty());
		System.out.println("Search Element 25 : "+ts.contains(25));
		System.out.println("Print the element's which is greater then or equals to 50 "+ts.tailSet(50));
		System.out.println("Return value betwween the range : "+ts.subSet(50, 90));
		System.out.println("remove Perticular Element (25)  : "+ts.remove(25));
	
		System.out.println(ts);
		
		System.out.println("Reverse order : "+ts.reversed());
		
		System.out.println("Iterator...");
		Iterator itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
