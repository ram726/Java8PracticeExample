//count number of failed student
package org.ram.java8Features.streamApi;

import java.util.ArrayList;

public class CountProgram2 {
public static void main(String[] args) {
	ArrayList<Integer> marks= new ArrayList<>();
	marks.add(70);
	marks.add(45);
	marks.add(10);
	marks.add(65);
	marks.add(20);
	marks.add(25);
	System.out.println(marks);
	int numberOfFailedStudent= (int) marks.stream().filter(i->i<35).count();
	System.out.println("Number of failed student= "+numberOfFailedStudent);
	
}
}
