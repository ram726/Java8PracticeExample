package org.ram.java8Features.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DecendingSortedProgram {
	public static void main(String[] args) {
		ArrayList<Integer> marks= new ArrayList<>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		List<Integer>l=marks.stream().sorted((a,b)->(a<b)?+1:(a>b)?-1:0).collect(Collectors.toList());
		System.out.println(l);
}
}