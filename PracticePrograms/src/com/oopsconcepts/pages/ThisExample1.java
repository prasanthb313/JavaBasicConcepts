package com.oopsconcepts.pages;

public class ThisExample1 
{
	int i;
	String name;
	float fee;
	
	ThisExample1(int i,String name,float fee)
	{
		this.i=i;
		this.name=name;
		this.fee=fee;
	}
	
	void print()
	{
		System.out.println("integer vaule is  "+i);
		System.out.println("name is  "+name);
		System.out.println("float value is  "+fee);
	}
	
	public static void main(String[] args) 
	{
		ThisExample1 test=new ThisExample1(10,"prasanth",2f);
		test.print();
		
	}
}
