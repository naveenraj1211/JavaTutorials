package com.lao.InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {

	public static void main(String[] args) 
	{

		String given = "automation";

		// Using String Buffer
		StringBuffer buffer = new StringBuffer();		
		buffer.append(given);
		buffer.reverse();
		System.out.println(buffer);


		// Using loop
		char[] charArray =given.toCharArray();
		String reverse="";
		for (int i=charArray.length-1;i>=0;i--) 
		{
			reverse=reverse+charArray[i];
		}

		System.out.println("reversed "+reverse);


		// Using collection
		char[] charArray2 =given.toCharArray();		
		List<Character> arrayList = new ArrayList<Character>();
		for (Character character : charArray2) 
		{
			arrayList.add(character);

		}
		Collections.reverse(arrayList);
		ListIterator iterator = arrayList.listIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}


}
