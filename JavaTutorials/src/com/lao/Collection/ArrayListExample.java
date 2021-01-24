package com.lao.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public void arrayExample() 
	{
		List<String> arryList = new ArrayList<String>();
		
		arryList.add("Selenium");
		arryList.add("TestNG");
		arryList.add("Cucumber");
		arryList.add("Selenium");
		System.out.println(arryList);
		//insertion order will be maintained
		//Duplication allowed
		
		System.out.println(arryList.get(1));
		System.out.println(arryList.indexOf("Cucumber"));
		System.out.println(arryList.lastIndexOf("Selenium"));
		
		List<String> anotherList = new ArrayList<String>();
		anotherList.addAll(arryList);
		System.out.println(anotherList);
		
		
		anotherList.remove(2);
		System.out.println(anotherList);
		anotherList.remove("TestNG");
		System.out.println(anotherList);
		anotherList.add(null);
		System.out.println(anotherList);
		
		anotherList.set(0, "Python");
		System.out.println(anotherList);
		
		System.out.println(anotherList.isEmpty());
		
		System.out.println("***************************************************");
		for (String string : anotherList) 
		{
			System.out.println(string);
		}
		System.out.println("***************************************************");
		for(int i=0;i<anotherList.size();i++)
		{
			System.out.println(anotherList.get(i));
		}
		System.out.println("***************************************************");
		ListIterator<String> iterator = anotherList.listIterator();
		while(iterator.hasPrevious())
		{
			System.out.println(iterator.previous());
		}
		System.out.println("***************************************************");
		Iterator<String> iterator2 = anotherList.iterator();
		while(iterator2.hasNext()) 
		{
			System.out.println(iterator2.next());
		}
		System.out.println("***************************************************");
		anotherList.clear();
		System.out.println(anotherList);
		
		
		
		
		
	}
		
	
	public static void main(String[] args) 
	{
		ArrayListExample arrayListExample  = new ArrayListExample();
		arrayListExample.arrayExample();

	}

}
