package org.ram.java8Features.lambdaExpression;

interface I1{
	public void m1();	
}

//class Demo implements I1{
//	@Override
//	public void m1() {
//		System.out.println("Hello");
//	}
//}

public class Program1 {
	public static void main(String[] args) {
		I1 i= ()->System.out.println("Hello World");
		i.m1();i.m1();i.m1();i.m1();
	}
}

