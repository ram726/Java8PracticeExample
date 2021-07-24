package org.ram.java8Features.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomizeSortingOrder {
	public static void main(String[] args) {
		ArrayList<Integer> marks= new ArrayList<>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		//increasing order
		List l=marks.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
		System.out.println(l);
		//decreasing order
		List ll=marks.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
		System.out.println(ll);
}
}
