package com.string.examples;

public class CreateStringUsingLiterals {

	public static void main(String[] args) {
		
		String s="prasanth";  // creating the string object by literals
							  // string constant pool area
		
	/*	String name="prasanth";	
		String name1="prasanth";
		String name2="prasanth";
        String name3="prasanth";	
		String name4="prasanth";
		String name5="prasanth";		
		String name16="prasanth";
		String name27="prasanth";
        String name38="prasanth";		
		String name48="prasanth";
		String name59="prasanth"; */
		
		
		// name value will store in string constant pool area  "name"
		// 1) we are creating string by using literals
		// 2) JVM will check whether value is available in String constant pool area or not
		// 3) it will refer the first value in string constant pool area
		// 4) Memory consumption will become less
		// 5) it will perform better execution
		
		System.out.println(s);
		
	}
}
