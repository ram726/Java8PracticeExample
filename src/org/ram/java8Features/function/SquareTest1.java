package org.ram.java8Features.function;

import java.util.function.Function;

public class SquareTest1 {
	public static void main(String[] args) {
		Function<Integer, Integer> f=i->i*i;
//		System.out.println("Square of 4 is: "+f.apply(4));
//		System.out.println("Square of 6 is: "+f.apply(6));
		int square[]= {2,8,3,4,6,7};
		for(int s:square)
		{
			System.out.println("Square of "+s+" is: "+f.apply(s));
		}
	}
}
