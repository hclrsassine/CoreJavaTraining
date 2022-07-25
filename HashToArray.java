package com.rachid;

import java.util.HashSet;
import java.util.Set;

public class HashToArray {
	public static void main(String[] args)
	{
		Set<Integer> set = new HashSet<>();
		
		set.add(5);
		set.add(15);
		set.add(25);
		set.add(35);
		set.add(45);
		
		Integer arr[] = new Integer[set.size()];
		
		set.toArray(arr);
	}
}
