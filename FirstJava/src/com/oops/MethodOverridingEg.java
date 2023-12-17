package com.oops;

public class MethodOverridingEg extends SuperRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingEg moe = new MethodOverridingEg();
		// print msg from SuperRiding class if there is no "same or matching" method 
		// in subclass
		// If there is exactly same method in the subclass then it is over ridden 
		// by subclass MethodOverridingEg and will print msg from MethodOverridingEg
			
		moe.msg();
		
	}
	public void msg(){
		System.out.println("Running from MethodOverridingEg");
		//if we still want to print Super class method 
		super.msg();
	}

}
class SuperRiding{
	public void msg(){
		System.out.println("Running from Superriding");
	}
}