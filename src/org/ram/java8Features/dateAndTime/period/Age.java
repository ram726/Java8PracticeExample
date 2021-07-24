package org.ram.java8Features.dateAndTime.period;

import java.time.LocalDate;
import java.time.Period;

public class Age {
	public static void main(String[] args) {
		LocalDate birthday=LocalDate.of(1996,12,28);
		LocalDate today=LocalDate.now();
		
		Period p=Period.between(birthday, today);
		System.out.println("Your age is: "+p.getYears()+"Years, "+p.getMonths()+"Months, "+p.getDays()+"Days  ");
		
		LocalDate death=LocalDate.of(1996+80,12,28);
		Period p1=Period.between(birthday, death);
		System.out.println("Your age is: "+p1.getYears()+"Years, "+p1.getMonths()+"Months, "+p1.getDays()+"Days  ");
	
		
	}
}
