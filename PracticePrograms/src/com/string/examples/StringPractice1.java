package com.string.examples;

public class StringPractice1 {

	public static void main(String[] args) {
		
		String s="ytiwowepowpowoi";
		
		String name="baddepudi";
		
		// char At example
		
		char letter=s.charAt(9);
		
		System.out.println(letter);
		
		// length of string 
		int a=s.length();
		System.out.println("given string lenght is   "+a);
		
		System.out.println(s.substring(3));
		
		System.out.println(s.substring(0, 3));
		
		System.out.println(name.contains("s")); // it will return true or false
		
	}
}
