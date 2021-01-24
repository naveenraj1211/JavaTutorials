package com.lao.Collection;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) 
	{
	
		LinkedHashMap<String,String> heros = new LinkedHashMap<String,String>();
		
		heros.put("IronMan", "Tony");
		heros.put("BatMan", "Bruce");
		heros.put("SuperMan", "Clark");
		
		System.out.println(heros);

	}

}
