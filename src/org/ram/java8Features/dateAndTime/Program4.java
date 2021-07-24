package org.ram.java8Features.dateAndTime;

import java.time.LocalDateTime;

public class Program4 {
	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		int dd=dt.getDayOfMonth();
		int mm=dt.getMonthValue();
		int yy=dt.getYear();
		System.out.println(dd+"-"+mm+"-"+yy);
		
		int s=dt.getSecond();
		int m=dt.getMinute();
		int h=dt.getHour();
		System.out.println(h+"/"+m+"/"+s);
	}
}
