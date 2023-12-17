package com.interfacebasics;

	public class Constructor {
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Note:Without a constructor we cannot create an object (to create an object we need a constructor
		Constructor co = new Constructor("Shefalee",9);
		Child ch = new Child();
		//If there is no constructor in a class then by default it will call default constructor(), but 
		//if there is other constructor in a class then we need to explicitly define default constructor()
		//Constructor co1 = new Constructor();  
	}
	Constructor(){
		System.out.println("I am in default constructor");
	}
	Constructor(int x){
		System.out.println("I am in single param constructor "+ x);
	}
	Constructor(String s,int x){
		this();
		System.out.println("I am in two param constructor "+ s +" "+ x);
	}
}
class Child extends Constructor{
	Child(){
		super(2);//calling a constructor( with super or this )should be the first statement inside
				//a constructor
		System.out.println("I am in child class constructor");
	}
}
