package org.ram.java8Features.constructorReference;

class Sample{
	public Sample() {
		System.out.println("Sample class constructor executed.");
	}
	public Sample(String s) {
		System.out.println("Sample class Parameterized constructor executed.");
	}
}

interface Intrf{
	//public Sample get();
	public Sample get(String s);
}

public class Test {
	public static void main(String[] args) {
		Intrf i=Sample::new;
		Sample s=i.get("hi");
	}
}
