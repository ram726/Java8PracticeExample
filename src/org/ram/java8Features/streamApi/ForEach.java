package org.ram.java8Features.streamApi;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class ForEach {
public static void main(String[] args) {
	ArrayList<Integer> l= new ArrayList<>();
	l.add(0);
	l.add(5);
	l.add(10);
	l.add(15);
	l.add(20);
	l.add(25);
	
	System.out.println(l);
//	Consumer<Integer>c=i->{
//		System.out.println("The square of "+i+" is: "+(i*i));};
//	l.stream().forEach(c);
	
	l.stream().forEach(i->System.out.println("The square of "+i+" is "+i*i));
}
}
