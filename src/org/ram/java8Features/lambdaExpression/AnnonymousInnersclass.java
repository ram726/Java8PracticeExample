package org.ram.java8Features.lambdaExpression;

interface DemoInterface{
	public void method1();
	public void methodWithStingParameter(String message);
	public int methodWithIntegerReturnType();
	public boolean methodWithParameterAndReturnType(int number);
}

public class AnnonymousInnersclass 
{
	public static void main(String[] args) {
		DemoInterface demoInterface= new DemoInterface() {
			
			@Override
			public void methodWithStingParameter(String message) {
				System.out.println("This is method with string parameter message: "+message);
			}
			
			@Override
			public boolean methodWithParameterAndReturnType(int number) {
				System.out.println("Method with boolean return type with respect to integer parameter. "+number);
				return false;
			}
			
			@Override
			public int methodWithIntegerReturnType() {
				System.out.println("Method with integer return type based on operation");
				return 0;
			}
			
			@Override
			public void method1() {
				System.out.println("This is sample method for Annonymous ineer class method.");				
			}
		};
		demoInterface.method1();
		demoInterface.methodWithIntegerReturnType();
		demoInterface.methodWithParameterAndReturnType(1);
		demoInterface.methodWithStingParameter("Hello Annonymous.");
	}
}
