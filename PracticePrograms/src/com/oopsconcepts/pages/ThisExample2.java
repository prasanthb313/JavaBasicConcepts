package com.oopsconcepts.pages;

public class ThisExample2 
{
	void firstMethod()
	{
		System.out.println("this method is used to print first method");
	}
	
	void secondMethod()
	{
		this.firstMethod();
		System.out.println("this method is used to print second method");
	}
	
	public static void main(String[] args)
	{
		ThisExample2 exmp=new ThisExample2();
		exmp.secondMethod();
	}
}

