package org.ram.java8Features.lambdaExpression;

interface Intrf{
	public int square(int a);
}

public class Square 
{
	public static void main(String[] args) 
	{
		Intrf i=a->a*a;
		System.out.println("Square of 4 is: "+i.square(4));
		System.out.println("Square of 5 is: "+i.square(5));
	}
}
