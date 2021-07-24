package org.ram.java8Features.lambdaExpression;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//class MyComparator implements Comparator<Integer>
//{
//	public int compare(Integer i1, Integer i2)
//	{
//		return (i1<i2)?-1:(i1>i2)?+1:0;
////		
////		if(i1<i2)
////			return -1;
////		else if(i1>i2)
////			return +1;
////		else
////			return 0;
//	}
//}

public class Collection1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(10); 
		l.add(20); 
		l.add(25); 
		l.add(5); 
		l.add(0); 
		l.add(15); 
		l.add(30);
		System.out.println(l);
	
		Comparator<Integer>c=(a,b)->(a>b)?-1:(a<b)?+1:0;
		Collections.sort(l,c);
		l.stream().forEach(System.out::println);
		List<Integer> l2= l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}
}
