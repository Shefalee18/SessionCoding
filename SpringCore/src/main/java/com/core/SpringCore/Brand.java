package com.core.SpringCore;

public class Brand {
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Brand [name=" + name + ", price=" + price + "]";
	}
	public Brand(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	

}
