package com.collection;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedList has value and address node. Faster than Arraylist.
		//Single LinkedList (has only next address)vs Doubly LinkedList (has next and previous address)
		
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("Shefalee");
		ll.add("Ankur");
		ll.add("Shefalee");
		ll.add("Rayan");
		ll.add("Amayra");
		
		ListIterator<String> lit = ll.listIterator();//Can be used for any class ArrayList,LinkedList,Vector
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		System.out.println("----------------------------------------");
		
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
	}

}
