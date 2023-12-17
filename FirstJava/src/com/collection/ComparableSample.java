package com.collection;

import java.util.TreeSet;
//Need to make sure that duplicate values are also inserted in correct order ; we use comparable interface for this
public class ComparableSample {
	public static void main(String[] args) {
		TreeSet<User> tsu = new TreeSet<User>();
		tsu.add(new User("Shefalee"));
		tsu.add(new User("Ankur"));
		tsu.add(new User("Amayra"));
		tsu.add(new User("Rayan"));
		tsu.add(new User("Siddharth"));
		
		for(User u:tsu){
			System.out.println(u);
		}
	}
}

//Comparable affects the original bean class
class User implements Comparable<User>{
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User(String username) {
		super();
		this.username = username;
	}


	@Override
	public int compareTo(User u) {
		// TODO Auto-generated method stub
		return this.username.compareTo(u.username);
	}

	@Override
	public String toString() {
		return "Name: " + this.username;
	}
	
	
}
