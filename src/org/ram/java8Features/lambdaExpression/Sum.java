package org.ram.java8Features.lambdaExpression;
interface Interface1{
	public void add(int a,int b);
}
public class Sum {
public static void main(String[] args) {
	Interface1 obj=(a,b)->System.out.println("Sum: "+(a+b));
	obj.add(2,3);
	obj.add(12,33);
	obj.add(20,300);
}
}
