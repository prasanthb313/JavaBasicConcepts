package com.string.examples;

public class StringSplit {

	public static void main(String[] args) {
		
		String name="     Baddepudi prasanth    ";
		
		String[] ref=name.split(" ");
		
		System.out.println("String length is  "+name.length());
		
		System.out.println("Array lenght is   "+ref.length);
		
		System.out.println(ref[5]); //creating the object address
		
		System.out.println(name.trim());
		
		System.out.println(name.isEmpty());
	}
}


