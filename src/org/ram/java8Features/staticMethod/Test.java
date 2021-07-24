package org.ram.java8Features.staticMethod;

interface Interf{
	public static void m1() {
		System.out.println("Interface static method");
	}
}
public class Test implements Interf{
public static void main(String[] args) {
	Interf.m1();
	
}
}
