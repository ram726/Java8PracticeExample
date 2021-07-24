package org.ram.java8Features.streamApi;

import java.util.ArrayList;

public class ToArray {
public static void main(String[] args) {
	ArrayList<Integer> l= new ArrayList<>();
	l.add(0);
	l.add(5);
	l.add(10);
	l.add(15);
	l.add(20);
	l.add(25);
	System.out.println(l);
	
	Integer[] i=l.stream().toArray(Integer[]::new);
	for(Integer i1:i)
		System.out.println(i1);
}
}
