package com.hibcoll;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userid")
	private int userid;
	
	private String username;
	private Set<Contact> phnums = new HashSet<Contact>();
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Emp(String username, Set<Contact> phnums) {
		super();
		this.username = username;
		this.setPhnums(phnums);
	}
	public Set<Contact> getPhnums() {
		return phnums;
	}
	public void setPhnums(Set<Contact> phnums) {
		this.phnums = phnums;
	}
	
}
