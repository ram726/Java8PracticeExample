//particular date and time
package org.ram.java8Features.dateAndTime;

import java.time.LocalDateTime;
import java.time.Month;

public class OfMethod {
	public static void main(String[] args) {
		LocalDateTime  dt=LocalDateTime.of(1995, Month.MAY, 11, 19, 10, 15, 36);
		System.out.println(dt);
	}
}
