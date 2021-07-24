//code without Method reference
package org.ram.java8Features.methodAndObjectReference;
public class Test {
	public static void main(String[] args) {
		Runnable runnable=()-> {
				for (int i = 0; i < 3; i++) {
					System.out.println("Child Thread.");
			}
		};
		Thread t = new Thread(runnable);
		t.start();
		for (int i = 0; i < 3; i++) {
			System.out.println("Main Thread.");
		}
	}
}
