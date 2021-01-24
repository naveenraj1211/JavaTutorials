package com.lao.javaLearning;

public class StringBufferExample {

	public static void main(String[] args) 
	{
	
		String name = "naveen";
		System.out.println(name.concat("raj"));
		System.out.println(name);
		
		StringBuffer name2 = new StringBuffer("naveen");
		System.out.println(name2.append("raj"));
		System.out.println(name2);

		
		System.out.println(name2.reverse());
	
		StringBuffer replaceThis = new StringBuffer("NAVEEN");
		System.out.println(replaceThis.replace(1, 5, "RAJ"));
		
		StringBuffer deleteThis = new StringBuffer("NAVEEN");
		System.out.println(deleteThis.delete(1, 5));
		
		StringBuffer insertThis = new StringBuffer("NAVEEN");
		System.out.println(insertThis.insert(5, "RAJ"));
		
		System.out.println(insertThis.capacity());
		
	}

}
