package com.lao.javaLearning;

public class StringExample {

	public static void main(String[] args) 
	{
	
		String name = "Naveenraj   "; //string literal
		int num = 3;
		
		//return the value for the particular index
		System.out.println("Charactor "+name.charAt(0));
		
		//return string length		
		System.out.println("Length of the string "+name.length());
		
		//check the equality of the string	
		System.out.println("Length of the string "+name.equals("naveen"));

		//check the equality of the string	without case sensitivity
		System.out.println("Length of the string "+name.equalsIgnoreCase("NAVEENRAJ"));
		
		//check if string is empty or not
		System.out.println(name.isEmpty());
		
		//return true or fasle based on value present or not
		System.out.println(name.contains("a"));
		
		
		//take crop string
		System.out.println(name.substring(1));
		System.out.println(name.substring(1,5));//method overloading
		
		System.out.println(name.concat(" Automation"));
		System.out.println(name);
		
		System.out.println(name.replace("e", "E"));
		
		System.out.println(name.replace("raj", "RAJ"));
		
		
		System.out.println(name.indexOf("c"));
		System.out.println(name.indexOf("a",0));
		
		System.out.println(name.indexOf('j'));
		System.out.println(name.indexOf("ra",5));
		
		System.out.println(name.trim());
		
		System.out.println(String.valueOf(num));
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		System.out.println(String.join("-", "Learn","Java","String"));
		System.out.println(String.join("/", "12","01","2021"));
		
		String splitName="India,is,my,country";
		
		String[] splittedWords=splitName.split(",");
		for (String string : splittedWords) 
		{
			System.out.println(string);
		}
		
		
		
	}
	
	

}
