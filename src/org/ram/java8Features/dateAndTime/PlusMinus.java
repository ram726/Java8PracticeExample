package org.ram.java8Features.dateAndTime;

import java.time.LocalDateTime;

class PlusMinus 
{
	public static void main(String[] args) {
		LocalDateTime dt= LocalDateTime.now();
		LocalDateTime m=dt.plusMonths(85);
		LocalDateTime m1=dt.minusMonths(17);
		System.out.println(dt);
		System.out.println(m);
		System.out.println(m1);
		LocalDateTime addyear=dt.plusYears(2).plusMonths(6).plusDays(52);
		System.out.println(addyear);
		
		
	}
}
