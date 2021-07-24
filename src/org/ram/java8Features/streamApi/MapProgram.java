package org.ram.java8Features.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapProgram {
	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		System.out.println(l);
		System.out.println("Increasing 5 marks");
		List<Integer> increasedMarks=l.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(increasedMarks);
	}
}
