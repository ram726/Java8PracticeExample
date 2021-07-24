package org.ram.java8Features.dateAndTime;
import java.time.LocalDate;
import java.time.LocalTime;

public class Program1 {
	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}
}
