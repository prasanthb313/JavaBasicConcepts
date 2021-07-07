package com.map.examples;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		
		Map<Integer, String> ref=new HashMap<Integer, String>();
		
		//passing values into map
		
		ref.put(1, "Baddepudi");
		ref.put(2, "Prasanth");
		
		//accessing values
		
		System.out.println(ref.get(1));
		
		System.out.println(ref.get(2));
		
		
		
	}
}






