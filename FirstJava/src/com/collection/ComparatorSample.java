package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Login> tsl = new TreeSet<Login>(new UnameCompare());
		tsl.add(new Login("Shefalee","abshjhj"));
		tsl.add(new Login("Ankur","jhjgyu"));
		tsl.add(new Login("Rayan","hghghj"));
		tsl.add(new Login("Amayra","ghghjg"));
		tsl.add(new Login("Siddharth","eryghhk"));
		
		for(Login l:tsl){
			System.out.println(l);
		}
	}

}
//Comparator doesn't affect the original bean class; its loosely coupled
class UnameCompare implements Comparator<Login>{

	@Override
	public int compare(Login l1, Login l2) {
		// TODO Auto-generated method stub
		return l1.getUsername().compareTo(l2.getUsername());
	}
	
}
class Login{
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [username=" + this.username + ", password=" + this.password + "]";
	}
		
}