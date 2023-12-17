package com.oops;

public class MethodOverloadingEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingEg moe = new MethodOverloadingEg();
		System.out.println(moe.sameMethod("Shefalee"));
		System.out.println(moe.sameMethod(3,5));
		System.out.println(moe.sameMethod(4.5f,5.5f));
		System.out.println(moe.sameMethod(6,7,9));
		
	}
	// Same Method with different return type, different number of arguments 
	// and different type of arguments
	public int sameMethod(int x,int y){
		return x+y;
	}
	public int sameMethod(int x,int y,int z){
		return x+y+z;
	}
	public float sameMethod(float x,float y){
		return x+y;
	}
	public String sameMethod(String s){
		return s;
	}

}
