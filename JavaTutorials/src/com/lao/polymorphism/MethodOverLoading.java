package com.lao.polymorphism;

public class MethodOverLoading {

	int add(int x, int y)
	{
		return x+y;
	}
	
	int add(int x, int y,int z)
	{
		return x+y+z;
	}
	
	float add(float x, float y) 
	{
		return x+y;
	}
	
	
	
	public static void main(String[] args) 
	{
		MethodOverLoading methodOverLoading = new MethodOverLoading();
		
		System.out.println(methodOverLoading.add(20, 40));
		System.out.println(methodOverLoading.add(0.2f, 1.2f));

	}

}
