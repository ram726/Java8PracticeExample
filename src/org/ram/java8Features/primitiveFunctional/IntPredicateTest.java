package org.ram.java8Features.primitiveFunctional;

import java.util.function.IntPredicate;

public class IntPredicateTest {
	public static void main(String[] args) {
		IntPredicate p=i->i%2==0;
		System.out.println(p.test(5));
		System.out.println(p.test(50));
	}
}
