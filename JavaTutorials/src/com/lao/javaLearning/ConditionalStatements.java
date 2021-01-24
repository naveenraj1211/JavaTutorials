package com.lao.javaLearning;

public class ConditionalStatements {
	
	boolean isCupEmpty = true;
	String heroName ="Iron Man";
	
	
	

	public static void main(String[] args) 
	{
		ConditionalStatements statements = new ConditionalStatements();
		
		if(statements.isCupEmpty) 
		{
			System.out.println("Fill the Cup");
		}
		else 
		{
			System.out.println("Drink the Coffee");
		}

		
		if(statements.heroName.equals("Iron Man")) 
		{
			System.out.println("My Super Hero is "+statements.heroName);
		}
		else if (statements.heroName.equals("Hulk")) 
		{
			System.out.println("My Super Hero is "+statements.heroName);
		}
		else 
		{
			System.out.println("no hero");
		}
		
		
		
	}

}
