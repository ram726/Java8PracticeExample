package org.ram.java8Features.lambdaExpression;
import java.util.ArrayList;
import java.util.Collections;

class Employee{
	String name;
	int eno;
	public Employee(String name, int eno) {
		this.name=name;
		this.eno=eno;
	}
	public String toString() {
		return eno+":"+name;
	}
}

public class MainEmployee {
	public static void main(String[] args) {
//		Employee e= new Employee("Abc", 123);
//		System.out.println(e);
		
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Abc", 120));
		l.add(new Employee("Xyz", 850));
		l.add(new Employee("Mnp", 632));
		l.add(new Employee("Pqr", 452));
		l.add(new Employee("Stu", 785));
		System.out.println(l);
		//sorting according to employee number
	//	Collections.sort(l,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		//sorting according to employee name
		Collections.sort(l, (e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(l);
}
}
