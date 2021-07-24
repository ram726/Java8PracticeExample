package org.ram.java8Features.lambdaExpression;

//class MyRunnable implements Runnable
//{
//	public void run() {
//		System.out.println("Child Thread");
//	}
//}
public class Multithreading 
{
	public static void main(String[] args) 
	{
		Runnable runnable=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		}; 
//		MyRunnable myRunnable=new MyRunnable();
		Thread t = new Thread(runnable);
		t.start();
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("Main Thread");
		}
	}
}
