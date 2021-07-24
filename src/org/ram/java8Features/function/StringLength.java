package org.ram.java8Features.function;

import java.util.function.Function;

public class StringLength {
	public static void main(String[] args) {
		Function<String, Integer>f=i->i.length();
		String[] name= {"sachin","dhoni","virat","sehwag","ganghuli"};
		for(String length:name) {
			System.out.println("Length of name "+length+" is: "+f.apply(length));
		}
	}
}
