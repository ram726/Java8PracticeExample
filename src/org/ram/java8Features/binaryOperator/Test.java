package org.ram.java8Features.binaryOperator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Test 
{
	public static void main(String[] args) {
//		BiFunction<String, String, String> f=(s1,s2)->s1+s2;
//		System.out.println(f.apply("Hello ", "World"));//Hello World
		
//		BinaryOperator<String> b=(s1,s2)->s1+s2;
//		System.out.println(b.apply("Hello ", "World"));
		
		IntBinaryOperator b=(a,a1)->a+a1;
		System.out.println(b.applyAsInt(4, 5)); //9
	}
}
