//check leap year
package org.ram.java8Features.dateAndTime.YearClass;
import java.time.Year;

public class CheckYear {
public static void main(String[] args) {
	Year y= Year.of(2210);
	if(y.isLeap())
		System.out.println("leap year");
	else
		System.out.println("not leap year");
}
}
