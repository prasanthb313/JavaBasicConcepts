package com.map.examples;

import java.util.HashMap;
import java.util.Map;

public class MapPractice2 {

	public static void main(String[] args) {
    Map<Integer, String> ref=new HashMap<Integer, String>();
		
		//passing values into map
		
		ref.put(1, "Baddepudi");
		ref.put(2, "Pra");
		
		System.out.println(ref.get(2));
		
		//before replacing we need to know the exact key and corresponding value
		ref.replace(2, "Prasanth");
		
		System.out.println(ref.get(2));
		
		
		ref.replace(1, "Prasanth");
		
		System.out.println(ref.get(1));
		
		//updating wrong value
		
		ref.replace(4, "Prasanth");
		
		System.out.println(ref.get(4));
	}
}
