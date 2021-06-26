package com.collections.exaples;

import java.util.ArrayList;
import java.util.Collections;

public class SortingNubersArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> ref=new ArrayList<Integer>();
		
		ref.add(97);
		ref.add(78);
		ref.add(56);
		ref.add(37);
		ref.add(54);
		ref.add(10);
		
		Collections.sort(ref);
		System.out.println(ref);
		
		Collections.reverse(ref);
		System.out.println(ref);
	}
}
