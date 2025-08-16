package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		 Queue<Integer>  pq = new PriorityQueue<Integer>();
		 pq.add(45);
		 pq.add(60);
	//	 pq.addAll(pq);
		 pq.offer(68);	//also used to add element on queue.
		 pq.add(99);
		
		 
		 // System.out.println(pq); //show IllegalArgumentException
		 
		 System.out.println(pq);
		 
		 //Show head element from the queue and if element is not found it show the exception as
		 //NullPointerException
		 System.out.println(pq.element());
		 
		//Show head element from the queue and if element is not found it shows the
		 //Null Value.
		System.out.println(pq.peek());
		
		//Show head element from the queue and if element is not found and also remove that 
		//element from queue 
		 System.out.println(pq.poll());
		 
		 System.out.println();
		 System.out.println("Remove Perticular Element : "+pq.remove(45));
		 System.out.println(pq);
		 
		 System.out.println("Search Element (60) : "+pq.contains(60));
		 
		 System.out.println("Remove all Element : ");
		 pq.clear();
		 
		 System.out.println(pq);
		 
		
	}

}
