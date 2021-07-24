package org.ram.java8Features.dateAndTime;

import java.time.LocalDate;

public class Program2 {
	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		System.out.println("Date is: "+date);
		
		int dd =date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();
		
		System.out.println(dd+":"+mm+":"+yy);
	}
}
