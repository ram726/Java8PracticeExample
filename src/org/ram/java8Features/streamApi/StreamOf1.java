package org.ram.java8Features.streamApi;
import java.util.stream.Stream;

public class StreamOf1 
{
public static void main(String[] args)
{
	Stream s=Stream.of(11,22,111,333,44,2266177,444);
	s.forEach(System.out::println);
	
	Integer[] i= {10,80,20,60,40};
	Stream.of(i).forEach(System.out::println);
}
}
