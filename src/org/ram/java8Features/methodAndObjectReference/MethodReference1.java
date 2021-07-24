//code with Method reference
package org.ram.java8Features.methodAndObjectReference;
public class MethodReference1 {
	public static void methodReference() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Child Thread");
		}
	}
	public  void methodReference1() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) {
//		Runnable r=()->{
//			for (int i = 0; i < 3; i++) {
//				System.out.println("Child Thread");
//			}
//		};
		//Runnable r=MethodReference1::methodReference;//method reference
		MethodReference1 t=new MethodReference1();
		Runnable r=t::methodReference1;
		Thread t1= new Thread(r);
		t1.start();
		for (int i = 0; i < 3; i++) {
			System.out.println("Main Thread");
		}
	}
}