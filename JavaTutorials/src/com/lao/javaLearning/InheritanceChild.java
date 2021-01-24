package com.lao.javaLearning;

public class InheritanceChild extends InheritanceParent
{

	public static void main(String[] args) 
	{
		InheritanceChild child = new InheritanceChild();
		System.out.println("My car wheels "+child.wheels);
		child.engine();
		//child.battery(); // we cannot call private method outside the class
		child.design(); // we can access within same package/ sub classes in other package

		
//		Access Modifier	within class	within package	outside package by subclass only	outside package
//		Private				Y					N						N							N
//		Default				Y					Y						N							N
//		Protected			Y					Y						Y							N
//		Public				Y					Y						Y							Y
		
	}
	
	
}
