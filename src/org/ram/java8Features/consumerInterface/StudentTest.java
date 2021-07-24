package org.ram.java8Features.consumerInterface;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student s[]= {new Student("sachin", 62),
				new Student("dhoni", 56),
				new Student("virat", 85),
				new Student("ricky", 45),
				new Student("izmaam", 32)
		};
		
		Function<Student, String>f=s1->{
			int marks=s1.marks;
			String grade="";
			if(marks>=80) grade="A[Distinction]";
			else if(marks>=60) grade="B[First Class]";
			else if(marks>=50) grade="C[Second Class]";
			else if(marks>=35) grade="D[Third Class]";
			else grade="E[Failed]";
			return grade;
		};
//		for(Student s2:s) {
//			System.out.println("Name: "+s2.name
//					+"|| Marks: "+s2.marks
//					+"|| Grade: "+f.apply(s2));
//		}
		//student having marks>=60
		Predicate<Student>p=i->i.marks>60;
		Consumer<Student> c=s5->System.out.println(s5.name+","+s5.marks+","+f.apply(s5));
		for(Student stu:s) {
			if(p.test(stu))
				c.accept(stu);
		}
//		System.out.println("Marks>=60");
//		for(Student s2:s) {
//			if(p.test(s2))
//				System.out.println("Name: "+s2.name
//						+"|| Marks: "+s2.marks
//						+"|| Grade: "+f.apply(s2));
//		}
	}
}
