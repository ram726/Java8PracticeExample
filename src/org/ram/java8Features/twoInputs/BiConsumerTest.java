package org.ram.java8Features.twoInputs;
import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee1{
	double salary;
	String name;
	public Employee1(double salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
		
	}
}

public class BiConsumerTest {
	public static void main(String[] args) {
		ArrayList<Employee1> l=new ArrayList<>();
		populate(l);
		BiConsumer<Employee1, Double>c=(e,d)->e.salary=e.salary+d;
		for(Employee1 e:l) {
			c.accept(e, (double) 500);
		}
		for(Employee1 e1:l) {
			System.out.println(e1.name+","+e1.salary);
		}
		}

	private static void populate(ArrayList<Employee1> l) {
		l.add(new Employee1(100,"abc"));
		l.add(new Employee1(200,"pqr"));
		l.add(new Employee1(300,"mnp"));
		l.add(new Employee1(400,"xyz"));
	}
}
