package com.oopsconcepts.pages;



class Test
{
	public void navigate()
	{
		System.out.println("this method is used to navigate");
	}
}

class Login extends Test
{
	public void navigate()
	{
		System.out.println("this method is used to login into application");
	}
}

public class UpCasting
{
    public static void main(String[] args)
    {
	    Test test=new Login();  // up casting
	    test.navigate();
	
	    
	    //down casting
	    
	    Login log=(Login) test; // doing up casting first and then doing down casting
	    
	    log.navigate();
	    
    }
// we will get class cast exception
	
}
