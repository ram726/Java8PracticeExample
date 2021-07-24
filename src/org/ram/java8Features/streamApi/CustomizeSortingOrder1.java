package org.ram.java8Features.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomizeSortingOrder1 {
public static void main(String[] args) {
	List<String> name=new ArrayList<String>();
	name.add("ravi");
	name.add("manish");
	name.add("rinky");
	name.add("akanksha");
	name.add("vivek");
	name.add("parmod");
	System.out.println(name);
	
	//default sorting--increasing order
	List<String> sortedName=name.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedName);
	
	//increasing order
	List<String> sortedName1=name.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
	System.out.println(sortedName1);
	
	//decreasing order
	List<String> sortedName2=name.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
	System.out.println(sortedName2);
}
}
