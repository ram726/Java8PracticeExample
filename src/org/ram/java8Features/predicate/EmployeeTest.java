package org.ram.java8Features.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String name;
	double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}
public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> l=new ArrayList<>();
		l.add(new Employee("avinash", 2135));
		l.add(new Employee("rinky", 2512));
		l.add(new Employee("sachin", 1563));
		l.add(new Employee("rahul", 3361));
		l.add(new Employee("malingga", 2822));
		
		Predicate<Employee>p=e->e.salary>2000;
		Predicate<Employee>p1=n->n.name.length()>=5;
		Predicate<Employee>even=e->e.salary%2==0;
				
		for(Employee e1:l) {
			if(p.and(p1).and(even).test(e1))
				System.out.println(e1.name+":"+e1.salary);
		}
	}
}
