package org.ram.java8Features.unaryOperator;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Test1 {
	public static void main(String[] args) {
		//UnaryOperator<Integer> u=i->i*i;
//		System.out.println("Square of 4 is: "+u.apply(4));
		IntUnaryOperator u=i->i*i;
		System.out.println("Square of 4 is: "+u.applyAsInt(4));
	}
}
