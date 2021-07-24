package org.ram.java8Features.streamApi;
import java.util.ArrayList;
public class MinMax {
public static void main(String[] args) {
	ArrayList<Integer> l= new ArrayList<>();
	l.add(0);
	l.add(5);
	l.add(10);
	l.add(15);
	l.add(20);
	l.add(25);
	
	System.out.println(l);
	
	int min=l.stream().min((a,b)->a.compareTo(b)).get();
	int max=l.stream().max((a,b)->a.compareTo(b)).get();
	System.out.println(min);
	System.out.println(max);
}
}
