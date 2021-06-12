package com.oopsconcepts.pages;






class Name  // super class
{
	void login() 
	{
		System.out.println("this method is for logging into the application");
	}
}


class Password extends Name
{
	public void login() 
	{
		System.out.println("this method is for password");
	}
}



public class MethodOverriding // public main class 
{

	public static void main(String[] args) 
	{
		Password pass=new Password();
		
		pass.login();
						
		Name n=new Name();
		n.login();
	}
}

