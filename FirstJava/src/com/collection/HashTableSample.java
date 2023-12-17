package com.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTableSample {
	public static void main(String[] args) {
		//Hashtable doesn't allow null key or values 
		//Key has unique values
		//It is Synchronized
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		
		ht.put(100,"Shefalee");
		ht.put(200,"Ankur");
		//tm.put(null,"Shefalee");
		ht.put(150,"Amayra");
		//ht.put(105,null);
	    //tm.put(null,"Mili");
		//ht.put(125,null);
		ht.put(135,"Monu");
		ht.put(145,"Monu");
		
		for(Map.Entry<Integer, String> me: ht.entrySet()){
			System.out.println(me.getKey()+ " " + me.getValue());
		} 

	}

}
