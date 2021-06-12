package com.oopsconcepts.pages;

public class CreateObject {

	String office="symphony"; //non static variable
	static String country="India"; //static variable
		
	static void printName() //static method
	{
		System.out.println("this method is used to print the names ");
	}
	
	static void printName(String name,String className) 
	{
				
		System.out.println("Name is "+name);
		System.out.println("class name is "+className);
	}
	
	void printColor(String color) //non static method
	{
		System.out.println("color is "+color);
	}
	
	public static void main(String[] args) {
		
		System.out.println("-------------calling static variables--------------");
		System.out.println(CreateObject.country);
		System.out.println("-------------calling non static variables--------------");
		//create object
		CreateObject create=new CreateObject();//stores in Heap memory
		System.out.println(create.office);				
		System.out.println("-------------calling the static method---------------");
		CreateObject.printName(); // calling static method
	    System.out.println(country);
	    CreateObject.printName("India","First class");
	    create.printColor("green"); //calling non static method
	}
}
