package com.first;

import java.util.Scanner;

public class InputData {
//Using Scanner class to input data from the user
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name:");
		String name= s.next();
		System.out.println("Enter age:");
		int age= s.nextInt();
		System.out.println("Name is-"+ name+ " Age is-"+age);
		s.close();
	}

}
