package com.oopsconcepts.pages;

public class Constructor1 {

	Constructor1(int rollNumber)
	{
		this("prasanth");
		System.out.println("roll number is  "+rollNumber);
	}
	
	Constructor1(String name)
	{
		this(true);
		System.out.println("name is   "+name);
	}
	
	Constructor1(boolean b)
	{
		System.out.println("boolean value is  "+b);
	}
	
	Constructor1()
	{
		this(1);	
		System.out.println("this is empty constructor");
	}
		
	//roll number is 1
	//name is prasanth
	//boolean is true
	//this is empty constructor
	
	public static void main(String[] args) {
		new Constructor1();
	}
}
