package com.rachid;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
	public static void main(String[] args)
	{
		List<Integer> arr1 = new ArrayList<>();
		
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4); //3
		
		List<Integer> arr2 = new ArrayList<>();
		for(int i = arr1.size()-1;i>=0;i--)
		{
			arr2.add(arr1.get(i));
		}
		
		System.out.println("Array Original");
		System.out.println(arr1);
		System.out.println("Array Reversed");
		System.out.println(arr2);
	}
}
