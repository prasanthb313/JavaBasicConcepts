package com.collections.exaples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		
		ArrayList<String> ref=new ArrayList<String>();
		
				
		ref.add("apple");
		ref.add("orange");
		ref.add("banana");
		ref.add("grapes");
		ref.add("mango");
		
		Iterator<String> iterate=ref.iterator();
		
		System.out.println("Printing the elements in the Array List  -- By using Iterator-----");
		
		while(iterate.hasNext())
		{
			System.out.println(iterate.next());
		}
		
		
		System.out.println("----------------Printing elements using for each Loop--------------");
		
		for(String var:ref)
		{
			System.out.println(var);
		}
	}
}



