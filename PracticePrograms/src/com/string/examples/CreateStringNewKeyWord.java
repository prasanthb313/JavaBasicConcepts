package com.string.examples;

public class CreateStringNewKeyWord {

	public static void main(String[] args) {
		
		String s=new String("Welcome");  // during the creation of object , we initialize the string
		String s1=new String("Welcome");
		String s3=new String("Welcome");
		String s4=new String("Welcome"); // all the references will be stored in heap area  ,i.e., s,s1,s2,s3
		
		System.out.println(s1+ "    "+ s+s3+s4);
	}
}

