package com.collections.exaples;

import java.util.ArrayList;

public class SetValueArrayList {

	public static void main(String[] args) {
		ArrayList<String> ref= new ArrayList<String>();
		
		//adding elements into array list
		
		ref.add("Prasanth");
		ref.add("Baddepudi");
		
		System.out.println(ref.get(0));
		
		//changing the value in array list
		
		ref.set(0, "Symphony");
		
		System.out.println(ref.get(0));
	}
}
