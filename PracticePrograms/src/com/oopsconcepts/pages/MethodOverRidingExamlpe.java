package com.oopsconcepts.pages;


class University
{
	public void percentage(int marks)
	{
		if(marks>35) 
		{
			System.out.println("student is passed");
		}
		else
		{
			System.out.println("student failed as per unoversity rule");
		}
	}
}

class Andhra extends University
{
	public void percentage(int marks)
	{
		if(marks>50) 
		{
			System.out.println("student is passed from Andhra University with marks  "+marks);
		}
		else
		{
			System.out.println("student failed as per Andhra university rule with marks  "+marks);
		}
	}
}

public class MethodOverRidingExamlpe {
public static void main(String[] args) {
	Andhra andh=new Andhra();
	andh.percentage(51);
	andh.percentage(31);
}
	
	
}





