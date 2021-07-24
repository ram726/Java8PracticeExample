package org.ram.java8Features.predicate;

import java.util.function.Predicate;

public class PredicateTest1 {
public static void main(String[] args) {
	Predicate<Integer>p1=i->i%2==0;
	System.out.println(p1.test(4));
	System.out.println(p1.test(5));
	System.out.println(p1.test(1000000000));
}
}
