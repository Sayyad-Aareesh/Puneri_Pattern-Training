package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		List<Integer> l =new ArrayList<Integer>();
		l.add(20);
		l.add(35);
		l.add(60);
		l.add(75);
		
		System.out.print("Element in Array-List : ");
		for(int i :l)
		{	
		System.out.print(" "+i);
		}
		
		List<Integer> ll =new LinkedList<Integer>();
		ll.add(45);
		ll.add(50);
		ll.add(34);
		ll.add(75);
		
		System.out.println();
		
		System.out.print("Element in Linked-List : ");
		for(int j :ll)
		{	
		System.out.print(" "+j);
		}
	
//		ll.add(35); //duplicate element 
//		System.out.println(l);
//		
//		ll.addFirst(89);
//		System.out.println(l);
//		
//		ll.addLast(90);
//		System.out.println(l);
//		
//		System.out.println("Remove First Element : "+ll.removeFirst());
//		System.out.println("Remove Last Element : "+ll.removeLast());
//		System.out.println("Remove Element by index number : "+ll.remove(2));
//		
//		System.out.println("Check List is empty or not : "+ll.isEmpty());
//		
//		System.out.println("Search Element in the list : " + ll.contains(20));
//		
//	
//		
//		System.out.println("Size is : " +ll.size());
//		
//		
//		System.out.println(ll);
//		//get second index value
//		System.out.println("Get Second index value : "+ll.get(2));
//		System.out.println("Get First index value : "+ll.getFirst());
//		System.out.println("Get Last index value : "+ll.getLast());
//		
//		//(search left to right)
//		System.out.println("Get First index number of  : "+ll.indexOf(35)); 	//print first index value.
//		
//		//(search right to left)
//		System.out.println("Get Last index value using Element or object  : "+ll.lastIndexOf(35));
//		//Iterator : Is used to iterate the value of collection object.
//		Iterator<Integer> i = ll.iterator();
//	
//		while(i.hasNext())
//		{
//			System.out.print(" "+i.next());
//		}
	

		System.out.println();
		l.addAll(ll);
		
		Collections.sort(l);
		Iterator<Integer> i = ll.iterator();
		System.out.println("Iterator...");
			while(i.hasNext())
			{
				System.out.print(" "+i.next());
			}
			
//		System.out.println("Array list after adding Linked-list elements  : "+l);
//		l.removeAll(ll); //remove all element of Linked-List from ArrayList
//		System.out.println(l);
		
//		l.retainAll(ll);
//		System.out.println(l); //it remove Array-List elements but does not remove same element on Linked-List
//		
		//System.out.println(l.containsAll(ll)); //return true if Array-list(list) contains specified collection.
		l.clear(); //remove all elements from Array-List (Collection).
		System.out.println(l);
		
	
	}

}
