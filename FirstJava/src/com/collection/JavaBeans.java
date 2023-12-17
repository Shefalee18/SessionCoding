package com.collection;

public class JavaBeans {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	public JavaBeans(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
