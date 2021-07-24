package org.ram.java8Features.streamApi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CompareStringLengthWise 
{
	public static void main(String[] args) 
	{
		List<String> name=new ArrayList<>();
		name.add("ravi");
		name.add("manish");
		name.add("rinky");
		name.add("akanksha");
		name.add("vivek");
		name.add("parmod");
		System.out.println(name);
		
		Comparator<String>c=(a,b)->{
			int l1=a.length();
			int l2=b.length();
			if(l1<l2) return -1;
			else if (l1>l2) return +1;
			else return a.compareTo(b);
		};
		
		List<String> sort=name.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sort);
	}
}
