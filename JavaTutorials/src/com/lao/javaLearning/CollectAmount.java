package com.lao.javaLearning;

public class CollectAmount {

	
	Integer ammountCollected = 4500;
	
	
	public void collectAndGiveItToMe() 
	{
		System.out.println("Amount collected and given "+ammountCollected);
		
	}
	
	public Integer returnAmount() 
	{
		return ammountCollected;
		
	}
	
	public static void main(String[] args) 
	{
		CollectAmount collectAmount = new CollectAmount(); // Creating Object
		collectAmount.collectAndGiveItToMe();
		
		System.out.println("Amount given to me "+collectAmount.returnAmount());
	}

}
