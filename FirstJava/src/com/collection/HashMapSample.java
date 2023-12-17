package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap doesn't maintain the insertion order (no sorting of key)
		// It only allows one null key as key is unique but it allows multiple null values and duplicate values
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(100,"Shefalee");
		hm.put(200,"Ankur");
		hm.put(null,"Shefalee");
		hm.put(150,"Amayra");
		hm.put(105,null);
		hm.put(null,"Mili");
		hm.put(125,null);
		hm.put(135,"Monu");
		hm.put(145,"Monu");
		
		for(Map.Entry<Integer, String> me: hm.entrySet()){
			System.out.println(me.getKey()+ " " + me.getValue());
		}
	}

}
