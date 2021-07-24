package org.ram.java8Features.twoInputs;

import java.util.function.BiPredicate;

public class BiPredicateTest {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bp=(a,b)->(a+b)%2==0;
		System.out.println(bp.test(10, 30)); // true
		System.out.println(bp.test(10, 31)); //false
	}

}
