package com.lao.javaLearning;

public class ConstructorOverloadingExample {
  
	String Name;
	
	ConstructorOverloadingExample() 
	{
		System.out.println("This non parameterised constructor");
		System.out.println("Name is "+Name);
	}
	
	ConstructorOverloadingExample(String name)
	{
		this.Name=name;
		System.out.println("This is parametries constructor");
		System.out.println("Name is "+Name);
	}
	
	
	public static void main(String[] args) 
	{
	 ConstructorOverloadingExample example = new ConstructorOverloadingExample();
	 ConstructorOverloadingExample example2 = new ConstructorOverloadingExample("Automation");
	

	}

}
