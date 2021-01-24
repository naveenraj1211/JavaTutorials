package com.lao.obstraction;

public class audi extends car {

	
	@Override
	public void engineSecret() 
	{
		System.out.println("audi Car engine secret....");
	}
	
	@Override
	public void companyVault() 
	{
		System.out.println("audi Car company vault....");
	}
	
	
	
	public static void main(String[] args) 
	{
		car car = new audi();
		car.engineSecret();
		car.companyVault();

	}

}
