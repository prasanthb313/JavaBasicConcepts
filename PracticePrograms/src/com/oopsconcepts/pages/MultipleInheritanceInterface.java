package com.oopsconcepts.pages;


interface Parent
{
	public void parentMethod();
}

interface Child extends Parent
{
	public void childMethod();
}

public class MultipleInheritanceInterface implements Child {

	@Override
	public void parentMethod() {
		System.out.println("parent method");
	}

	@Override
	public void childMethod() {
		System.out.println("child method");
	}
	
public static void main(String[] args) {
	MultipleInheritanceInterface ref=new MultipleInheritanceInterface();
	
	ref.childMethod();
	ref.parentMethod();
}


}
