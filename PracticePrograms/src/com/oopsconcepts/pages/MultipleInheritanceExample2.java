package com.oopsconcepts.pages;


interface Parent1
{
	public void login();
}

interface Child1
{
	public void login();
}

public class MultipleInheritanceExample2 implements Parent1,Child1
{

	@Override
	public void login() {
		System.out.println("multiple inheritance is possible in interface");
	}
public static void main(String[] args) {
	MultipleInheritanceExample2 ref=new MultipleInheritanceExample2();
	ref.login();
}
}
