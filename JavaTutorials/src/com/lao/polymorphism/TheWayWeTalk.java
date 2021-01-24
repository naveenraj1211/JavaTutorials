package com.lao.polymorphism;

public class TheWayWeTalk {

	
	public void talk(Parents styleofTalking) 
	{
		System.out.println("Polite,Resfectful....");
	}
	
	public void talk(Partner styleofTalking) 
	{
		System.out.println("love,Romantic....");
	}
	
	public void talk(Boss styleofTalking) 
	{
		System.out.println("Business....");
	}
	
	public static void main(String[] args) 
	{
		TheWayWeTalk wayWeTalk = new TheWayWeTalk();
		
		Parents parents = new Parents();
		wayWeTalk.talk(parents);
		
		Boss  boss = new Boss();
		wayWeTalk.talk(boss);
		
		Partner partner= new Partner();
		wayWeTalk.talk(partner);
		
	}

}
