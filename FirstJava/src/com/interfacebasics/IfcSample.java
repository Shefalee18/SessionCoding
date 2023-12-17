	package com.interfacebasics;

public class IfcSample implements Ifc1, Ifc2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfcSample is = new IfcSample();
		Ifc1.test2();
		is.test1();
		System.out.println(is.add(ifc1_x, ifc2_y));
		//How to create an object for an Interface? - Through Anonymous class shown below, where only 
		// abstract classes can be accessed and need to implement them
		
		/*Ifc2 ifc2 = new Ifc2() {
			
			@Override
			public int mult(int x, int y) {//Anonymous inner type
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int sub(int x, int y) {
				// TODO Auto-generated method stub
				return 0;
			}
		};*/
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int mult(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

}
