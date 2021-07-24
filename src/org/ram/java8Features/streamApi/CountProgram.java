package org.ram.java8Features.streamApi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountProgram {
	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		
		List<?> ll=l.stream().filter(i->i%5==0).collect(Collectors.toList());
		int a=(int) l.stream().filter(i->i%5==0).count();
		System.out.println(a+"->"+ll);
	}
}