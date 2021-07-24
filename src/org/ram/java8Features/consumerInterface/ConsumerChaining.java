package org.ram.java8Features.consumerInterface;

import java.util.function.Consumer;

class Movie{
	String name;
	Movie(String name){
		this.name=name;
	}
	
}

public interface ConsumerChaining {
public static void main(String[] args) {
	Consumer<Movie> c1=m->System.out.println(m.name+" movie is ready to release.");
	Consumer<Movie> c2=m->System.out.println(m.name+" movie is released and floped.");
	Consumer<Movie> c3=m->System.out.println(m.name+" movie information is stored in database.");
	Consumer<Movie>consumerChaining=c1.andThen(c2).andThen(c3);
	Movie m=new Movie("Superman");
	consumerChaining.accept(m);
	
}
}
