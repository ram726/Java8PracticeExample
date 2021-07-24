package org.ram.java8Features.optionalClass;

import java.util.Optional;

public class OptionalExmple {
	
	public static Optional<String> getName(){
//		String name="sachin";
		String name=null;
		return Optional.of(name);
	}
	
	public static void main(String[] args) {
		
		//String str=null;
		String str="java8";
		
//		if(str==null)
//		{
//			System.out.println("this is null object");
//		}
//		else {
//			System.out.println(str.length());
//		}
		
		Optional o=Optional.ofNullable(str);
		System.out.println(o.isPresent());//true
		System.out.println(o.get());//java
		System.out.println(o.orElse("no value"));
	
		Optional nameOptional= getName();
		System.out.println(nameOptional.orElse("null return"));
	}
}
