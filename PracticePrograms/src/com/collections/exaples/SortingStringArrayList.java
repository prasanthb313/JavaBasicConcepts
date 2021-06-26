package com.collections.exaples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingStringArrayList {

	public static void main(String[] args) {
		List<String> ref=new ArrayList<String>();
		
		ref.add("Prasanth");
		ref.add("Baddepudi");
		ref.add("Apple");
		ref.add("Nellore");
		ref.add("Guntur");
		
		Collections.sort(ref);
		
		System.out.println(ref);
		
	
		
		
	}
}

