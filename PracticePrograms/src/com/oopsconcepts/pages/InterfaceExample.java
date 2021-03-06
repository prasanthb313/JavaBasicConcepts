package com.oopsconcepts.pages;


interface ParentClass
{
	static final int i =10;             // variables are static and final
	static final int k=90;
	
	public abstract  void naivgate();  //methods are public and abstract by default
	public abstract void login();
	
}
public class InterfaceExample implements ParentClass{

	@Override
	public void naivgate() {
		// TODO Auto-generated method stub
		System.out.println("navigate to the application");
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login into the application");
	}
	
	public static void main(String[] args) {
		ParentClass ref=new InterfaceExample();
		ref.naivgate();
		ref.login();
		System.out.println("integer value is  "+InterfaceExample.i);
		System.out.println("integer value is  "+InterfaceExample.k);
	}
}
