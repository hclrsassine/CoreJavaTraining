package com.rachid;

import java.util.LinkedList;
import java.util.List;

public class ReplaceElem {
	public static void main(String[] args)
	{
		List<String> list1 = new LinkedList<>();
		list1.add("hello");
		list1.add("hola");
		list1.add("bonjour");
		
		list1.set(2, "gutentag");
		
		System.out.println(list1);
	}
}
