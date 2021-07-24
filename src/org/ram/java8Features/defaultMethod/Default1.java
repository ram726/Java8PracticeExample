package org.ram.java8Features.defaultMethod;

interface Left{
	default void method1() {
		System.out.println("Left method1.");
	}
	default void method2() {
		System.out.println("Hello I'm default method2.");
	}
}
interface Right{
	default void method1() {
		System.out.println("Right method1.");
	}
}
public class Default1 implements Left,Right 
{
	public static void main(String[] args) 
	{
		Default1 d= new Default1();
		d.method1();
	}

	@Override
	public void method1() {
		System.out.println("This is Child Method");
		Right.super.method1();
	}
}
