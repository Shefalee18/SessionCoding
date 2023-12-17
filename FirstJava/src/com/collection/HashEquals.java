package com.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashEquals {
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public static void main(String[] args) {
		HashEquals h1 =new HashEquals();
		HashEquals h2 =new HashEquals();
		h1.setId(100);
		h2.setId(100);
		
		System.out.println(h1.equals(h2)); 
		
		Set<HashEquals> s = new HashSet<HashEquals>();
		s.add(h1);
		s.add(h2);
		
		System.out.println(s);
	}
	//Inside collection Hashcode() is used to locate the object 
	//Hashcode() finds the right bucket using HashCode value 
	//When we override equals() then it is mandatory to override hashcode() as well
	@Override
	public int hashCode() {
	/*	final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result; */
		return Objects.hash(id);
	}
	//Inside the bucket we need to find right element by using equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashEquals other = (HashEquals) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
