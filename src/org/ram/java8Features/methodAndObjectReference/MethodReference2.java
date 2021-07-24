//method reference with return type
package org.ram.java8Features.methodAndObjectReference;
interface Intrf{
	public void add(int firstNumber, int secondNumber);
}
public class MethodReference2 {
	public int sum(int number1, int number2) {
		System.out.println("Sum is: "+(number1+number2));
		return number1+number2;
	}
	public static void main(String[] args) {
		MethodReference2 m=new MethodReference2();
		Intrf i=m::sum;
		i.add(100, 200);
	}
}
