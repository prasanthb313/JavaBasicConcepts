package com.oopsconcepts.pages;

public class ThisStatement {
	
	String name="prasanth";
	int i=20;
	
	public void printName() {
		
		System.out.println(this.i);
	}
	
	public static void main(String[] args) {
		
		ThisStatement test=new ThisStatement();		
		test.printName();
	}
}
