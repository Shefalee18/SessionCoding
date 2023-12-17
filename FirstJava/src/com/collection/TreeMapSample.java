package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeMap doesn't allow null for key and it sorts the key 
		//It allows null values
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(100,"Shefalee");
		tm.put(200,"Ankur");
		//tm.put(null,"Shefalee");
		tm.put(150,"Amayra");
		tm.put(105,null);
	    //tm.put(null,"Mili");
		tm.put(125,null);
		tm.put(135,"Monu");
		tm.put(145,"Monu");
		
		for(Map.Entry<Integer, String> me: tm.entrySet()){
			System.out.println(me.getKey()+ " " + me.getValue());
		} 

	}

}
