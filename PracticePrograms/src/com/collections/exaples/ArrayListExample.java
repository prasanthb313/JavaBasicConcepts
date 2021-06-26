package com.collections.exaples;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
//interface		
		
		
		ArrayList<String> list=new ArrayList<String>(); // creation of Array list
		
		list.add("hyma"); // adding data into the array
		list.add("sri");
		list.add("durga");
		
		// getting the size of the array list
		System.out.println("size of the given array list is  "+list.size());
		
		//index will start from zero only
		
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i));
		}
				
		System.out.println("----------printing the all the elements in Array List--------------");
		
		
		System.out.println(list);
	}
}
