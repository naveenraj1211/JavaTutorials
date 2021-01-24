package com.lao.Collection;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) 
	{
	
		TreeMap<String,String> heros =new TreeMap<String,String>();
		
		heros.put("IronMan", "Tony");
		heros.put("BatMan", "Bruce");
		heros.put("SuperMan", "Clark");
		
		heros.put("SuperMan", "naveen");
		heros.put("SuperMan", "raj");
		
		heros.put(null, "virat");
				
		System.out.println(heros);

	}

}
