package com.lao.Collection;

import java.util.HashMap;

public class HashMapExample {


	public static void main(String[] args) 
	{
		
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
				
		employeeMap.put(1, "Naveen");
		employeeMap.put(2, "Selenium");
		employeeMap.put(3, "India");
		employeeMap.put(4, "Testing");
		
		System.out.println(employeeMap);
		
		HashMap<Integer, String> employee2Map = new HashMap<Integer, String>();
		employee2Map.putAll(employeeMap);
		System.out.println(employee2Map);
		
		System.out.println("contains Key"+employeeMap.containsKey(2));
		System.out.println("contains Value"+employeeMap.containsValue("India"));
		
		System.out.println("Key is in the map"+employee2Map.keySet());
		System.out.println("Values is in the map"+employee2Map.values());
		
		System.out.println("Value of the Key"+employee2Map.get(3));
		
		System.out.println("Value of the entry"+employee2Map.entrySet());
		
		
		
		
		
		
		
		

	}

}
