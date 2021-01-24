package com.lao.javaLearning;

public class ChildClass extends ParentClass
{

	
	public ChildClass() 
	{
		super();
		System.out.println("This is child class non parameterised constructor ");
	}
	
	
	public static void main(String[] args) {
	
		ChildClass  childClass = new ChildClass();

	}

}
