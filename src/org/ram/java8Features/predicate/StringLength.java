package org.ram.java8Features.predicate;

import java.util.function.Predicate;

public class StringLength 
{
	public static void main(String[] args) {
		Predicate<String> p1=s->s.length()>5;
		System.out.println(p1.test("Hello"));
		System.out.println(p1.test("Predicate"));
		String s[]= {"Java","Python","Android","Ruby","Mockito","JavaScript"};
		Predicate<String> p2=s1->s1.length()>5;
		for(String s3:s) {
			if(p2.test(s3))
				System.out.println(s3);
		}
		
	}
}
