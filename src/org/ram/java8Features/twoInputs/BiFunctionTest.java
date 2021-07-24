package org.ram.java8Features.twoInputs;
import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee{
	int eno;
	String name;
	public Employee(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}
}

public class BiFunctionTest {
	public static void main(String[] args) {
		ArrayList<Employee> l=new ArrayList<>();
		BiFunction<Integer, String, Employee> bf=(eno,name)->new Employee(eno, name);
		l.add(bf.apply(100, "abc"));
		l.add(bf.apply(200, "xyz"));
		l.add(bf.apply(300, "mnp"));
		l.add(bf.apply(400, "pqr"));
		for(Employee e:l)
			System.out.println(e.eno+","+e.name);
	}
}
