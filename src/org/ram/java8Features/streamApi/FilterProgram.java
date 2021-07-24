package org.ram.java8Features.streamApi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterProgram {
	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		
		System.out.println(l);
		List<Integer>marks=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(marks);
	}
}
