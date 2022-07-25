package com.rachid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElem {
	public static void main(String[] args)
	{
		List<Integer> arr1 = new ArrayList<>();
		
		arr1.add(1);
		arr1.add(2);
		
		Collections.swap(arr1, 0, 1);
		
		System.out.print(arr1);
	}
}
