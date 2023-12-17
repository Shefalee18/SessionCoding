package com.collection;

import java.util.ArrayList;
import java.util.Iterator;



public class ALSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();//ArrayList uses Binary search to search the elements.
		al.add("Shefalee");
		al.add("Ankur");
		al.add("Shefalee");
		al.add("Rayan");
		al.add("Amayra");
		
		
		ArrayList<String> al2= new ArrayList<String>();
		al2.add("Raki"); 	
		al2.add("Jilsa");
		
		al.addAll(al2); // adding anothoer ArrayList al2 to first one al
		//System.out.println(al);
		
		//Iterator interface(only moves forward) to retrieve the stored objects in ArrayList
		Iterator<String> it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
