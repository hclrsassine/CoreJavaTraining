package com.rachid;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class LListIteration {
	public static void main(String[] args)
	{
		List<String> list1 = new LinkedList<>();
		list1.add("hello");
		list1.add("hola");
		list1.add("bonjour");
		
		Iterator<String> it = list1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
