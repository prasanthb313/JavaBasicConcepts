package com.map.examples;

import java.util.HashMap;

public class MapExample1 {

	public static void main(String[] args) {
		HashMap<Integer, String> ref=new HashMap<Integer, String>(); //creation of Map
		
		//passing values into map
		
		ref.put(1, "Prasanth");
		ref.put(1, "ABC"); // Need to get error
		
		
		//accessing data from map
		
		System.out.println(ref.get(1));
		
		System.out.println(ref.get(1));
		
	}
}



