package com.protectedpkg1;

import com.protectedpkg.Pack1;

public class Pack2Test extends Pack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Pack1 pack1 = new Pack1();
	//	pack1.method1();//Protected method method2() is not available
		Pack2Test pack2test = new Pack2Test(); //We can access protected members through inheritance and the creating object for subclass
		pack2test.method1();
		pack2test.method2();
	}

}
