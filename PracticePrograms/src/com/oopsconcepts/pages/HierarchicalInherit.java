package com.oopsconcepts.pages;

public class HierarchicalInherit {
public static void main(String[] args) {
	
	FirstClass first=new FirstClass();
	first.login();
	first.firstMethod();
	
	System.out.println("-----------Executing the second class properties------------");
	SecondClass second=new SecondClass();
	second.thirdMethod();
}
}
