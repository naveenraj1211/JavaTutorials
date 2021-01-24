package com.lao.polymorphism;

public class OverideChild extends OverideParents
{

	//@Override
	public void marriage() 
	{
		System.out.println("My Marriage my Rules");
		super.marriage();
	}
	
	
	
	
	public static void main(String[] args) 
	{
		OverideParents parents = new OverideChild();
		parents.assets();
		parents.marriage();
		
		
	}

}
