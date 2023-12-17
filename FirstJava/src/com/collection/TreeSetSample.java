package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet contains only unique elements(duplicates are overrided) vs List allows duplicates too
				//TreeSet maintains ascending order while storing objects 
				TreeSet<String> ts= new TreeSet<String>();
				ts.add("Shefalee");
				ts.add("Ankur");
				ts.add("Shefalee");
				ts.add("Rayan");
				ts.add("Amayra");
				ts.add("Tina");
				ts.add("Shefalee");
				
				Iterator<String> it = ts.iterator();
				while(it.hasNext()){
					System.out.println(it.next());
				}
	}

}
