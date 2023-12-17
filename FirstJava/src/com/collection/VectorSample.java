package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vector is Synchronized 
		Vector<String> v1= new Vector<String>();
		v1.add("Shefalee");
		v1.add("Ankur");
		v1.add("Amayra");
		v1.addElement("Rayan"); //addElement() only available for Vector class
		
		Enumeration<String> e = v1.elements(); //Enumeration is only available for Vector class
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
 		
	}

}
