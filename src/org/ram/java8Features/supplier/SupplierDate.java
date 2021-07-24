package org.ram.java8Features.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDate {
	public static void main(String[] args) {
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());
	}
}
