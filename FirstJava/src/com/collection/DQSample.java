package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.DelayQueue;

public class DQSample {
	//ArrayDeque is a class derived from DeQueue Interface	
	public static void main(String[] args) {
		// Deque is double ended queue. You can add/remove from both ends
		
		Deque<String> dq = new ArrayDeque<String>();
		dq.offer("Shefalee");
		dq.offer("Ankur");
		dq.offer("Amayra");
		dq.add("Rayan");
		dq.offerFirst("Aarna");
		dq.offerLast("Panya");
		dq.offer("Panvi");
		
		for(String s:dq){
			System.out.println(s);
		}
		dq.pollLast();
		System.out.println("---------------------------------");
		for(String s:dq){
			System.out.println(s);
		}
	}
	

}
