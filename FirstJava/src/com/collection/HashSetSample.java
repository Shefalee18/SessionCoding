package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet contains only unique elements vs List allows duplicates too
		//HashSet doesn't maintain any order while storing objects 
		//Duplicates wont give error , it will be overrided
		HashSet<String> hs= new HashSet<String>();
		hs.add("Shefalee");
		hs.add("Ankur");
		hs.add("Shefalee");
		hs.add("Rayan");
		hs.add("Amayra");
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	

}
