package com.collection;

public class TestJavaBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaBeans jb = new JavaBeans("Shefalee", 37);
		//jb.setAge(28); //restricting to manipulate the age
		System.out.println(jb.getName() + " " + jb.getAge());
		
	}

}
