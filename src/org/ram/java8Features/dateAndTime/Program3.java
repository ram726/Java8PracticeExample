package org.ram.java8Features.dateAndTime;

import java.time.LocalTime;

public class Program3 {
	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		
		System.out.println(time);
		
		int h=time.getHour();
		int m=time.getMinute();
		int s=time.getSecond();
		int ns=time.getNano();
		
		System.out.println(h+"-"+m+"-"+s+"-"+ns);
				
	}
}
