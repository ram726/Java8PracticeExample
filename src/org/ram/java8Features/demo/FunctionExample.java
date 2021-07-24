package org.ram.java8Features.demo;

import java.util.function.Function;

public class FunctionExample {
//	public static int square(int n)
//	{
//		return n*n;
//	}
	public static void main(String[] args) {
//		System.out.println("Square of 4 is: "+square(4));
		Function<Integer, Integer>f=i->i*i;
		System.out.println("Square of 5 is: "+f.apply(5));
		System.out.println("Square of 4 is: "+f.apply(4));
	}
}
