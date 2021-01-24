package com.lao.Collection;

import java.util.LinkedList;

public class LinkedListExample {

	
	
	public void linkedListExample() 
	{
		LinkedList<Integer> integerList = new LinkedList<Integer>();
		integerList.add(2);
		integerList.add(4);
		integerList.add(5);
		System.out.println(integerList);
		integerList.addFirst(1);
		integerList.addLast(6);
		System.out.println(integerList);
		System.out.println(integerList.getFirst());
		System.out.println(integerList.get(3));
		
		integerList.remove(3);
		integerList.removeFirst();
		integerList.removeLast();
		integerList.removeFirstOccurrence(2);
		integerList.removeLastOccurrence(2);
		System.out.println(integerList);
		integerList.poll();
		System.out.println(integerList);
		
		System.out.println("*********************************");
		
		
		
	}
	
	
	
	public static void main(String[] args) 
	{
		LinkedListExample example = new LinkedListExample();
		example.linkedListExample();
		

	}

}




