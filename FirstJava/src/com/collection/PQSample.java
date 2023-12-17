package com.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First In Fist Out 
		//Doesn't maintain order
		PriorityQueue<String> pq= new PriorityQueue<>();
		pq.add("Shefalee");
		pq.add("Ankur");
		pq.add("Mili");
		pq.add("Rayan");
		pq.add("Amayra");
		
		Iterator<String> it = pq.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//element() and peek () returns same value. Element() will throw NoSuchElementException if the list is empty,
		//whereas peek() will return Null if the list is empty.
		System.out.println("Head : " + pq.element()); 
		System.out.println("Head : " + pq.peek());
		
		//remove() will throw NoSuchElementException if the list is empty,
		//whereas poll() will return Null if the list is empty.
		pq.remove();
		pq.poll();
		
		System.out.println("After removing two elements");
		
		Iterator<String> it2 = pq.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
	}

}
