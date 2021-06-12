package com.oopsconcepts.pages;


class Browser
{
	void navigate()
	{
		System.out.println("this methos is for launching the browser");
	}
}

class FaceBook extends Browser
{
	void navigate()
	{
		System.out.println("this methos is for browsing facebook");
	}
}

class Instagram extends Browser
{
	void navigate()
	{
		System.out.println("this methos is for browsing Instagram");
	}
}

class WhatsUp 
{
	public void navigate(Instagram insta)
	{
		insta.navigate();
	}
}

public class PassByReference {
public static void main(String[] args) {
	
	Instagram face=new Instagram(); //creating the object for instagram
	WhatsUp wht=new WhatsUp();      //created object for what's up
    wht.navigate(face);
}
}











