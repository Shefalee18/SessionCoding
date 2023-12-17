package com.hibcoll;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="phoneid")
	private int phoneid;
	
	private String phonenumber;
	public int getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(int phoneid) {
		this.phoneid = phoneid;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Contact(String phonenumber){
		this.phonenumber = phonenumber;
	}
}
