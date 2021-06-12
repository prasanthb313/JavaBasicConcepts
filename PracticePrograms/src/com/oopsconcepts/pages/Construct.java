package com.oopsconcepts.pages;

public class Construct {

	 Construct()
	 {
		System.out.println("This is empty constructor");
	 }
	 Construct(String name)
	 {
		System.out.println("User name is   "+name);
	 }
	 Construct(int i)
	 {
		 System.out.println("integer value is  "+i);
	 }
     Construct(boolean b)
     {
		 System.out.println("boolean is  "+b);
	 }
     
     //main method starts
     public static void main(String[] args) {
    	new Construct();
    	new Construct("Prasanth");
	}
     
}
