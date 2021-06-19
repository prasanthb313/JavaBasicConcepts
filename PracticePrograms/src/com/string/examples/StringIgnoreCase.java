package com.string.examples;

public class StringIgnoreCase {

	public static void main(String[] args) {
		String name="prasanth";
		
		String name1="PRASANTH";
		
		System.out.println(name.equals(name1));
		
		System.out.println(name.equalsIgnoreCase(name1));
		
	}
}
