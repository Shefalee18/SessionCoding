package com.first;


final class SuperClass{//final class prevents Inheritance
	public final void superdisplay(){ //final method prevents overriding
		System.out.println("Inside super class");
	}
}

public class FinalSample {
	static int y; //No initialization the it will take default value
	static String s;//No initialization the it will take default value
	//static final int z; // need to initialize final variable
	static public final int x= 5;
	public static void main(String[] args) {
		//x=10;
		System.out.println(y + " " + s);
		FinalSample fs = new FinalSample();
		fs.superdisplay();
			
	}
	public void superdisplay(){ 
		System.out.println("Inside child class");
	}
	
}
