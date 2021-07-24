package org.ram.java8Features.demo;
import java.util.function.Predicate;
public class PredicaateExample {
	public static void main(String[] args) {
		Predicate<Integer>p=i->i%2==0;
		System.out.println(p.test(4));
		System.out.println(p.test(5));
	}

}
