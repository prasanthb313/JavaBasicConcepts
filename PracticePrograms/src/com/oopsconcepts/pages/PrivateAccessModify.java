package com.oopsconcepts.pages;


class Example
{
	private int i=10;
	private void login()
	{
		System.out.println("Method for login into the application");
	}
}


public class PrivateAccessModify {
	
	private int i=10;
	private void login()
	{
		System.out.println("Method for login into the application");
	}
	
	public static void main(String[] args) {
		PrivateAccessModify ex=new PrivateAccessModify();
		ex.login();
		System.out.println(ex.i);
	}
}

