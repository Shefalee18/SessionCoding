package com.autowired.SpringAutowired;

import org.springframework.beans.factory.annotation.Autowired;

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
	
	@Autowired(required=true)
	public void setPrice(int price) {
		this.price = price;
	}
}
	