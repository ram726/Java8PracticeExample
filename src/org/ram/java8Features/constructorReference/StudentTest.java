package org.ram.java8Features.constructorReference;
class Student{
	int roll;
	String name;
	int marks;
	int age;
	public Student(int roll, String name, int marks, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
}
//class Demo implements Intrfe{
//	@Override
//	public Student get(int roll, String name, int marks, int age) {
//		Student s=new Student(1, "abc", 56, 12);
//		return s;
//	}
	

interface Intrfe{
	public Student get(int roll,String name, int marks,int age);
}
public class StudentTest {
	public static void main(String[] args) {		
		Intrfe i=(roll,name,marks,age)->new Student(1, "abc", 56, 120);
//		 Intrfe i=Student::new;
	}
}
