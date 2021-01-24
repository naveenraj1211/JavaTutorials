package com.lao.javaLearning;

public class InheritanceParent 
{

	public int wheels= 4;
	
	public void engine() 
	{
		System.out.println("This is my car engine");
	}
	
	private void battery()
	{
		System.out.println("This is my car battery");
	}
	
	
	protected void design()
	{
		System.out.println("This is my car design");
	}
}
