package com.oopsconcepts.pages;



class Bike
{
	public void information()
	{
		System.out.println("it is for using personal work-----");
	}
}

class Pulsar extends Bike
{
	public void information()
	{
		System.out.println("this bike model is pulasr 123 and cost is 1,24,555 RS");
	}
}

class Honda extends Bike
{
	public void information()
	{
		System.out.println("this bike model is Honda 567 and cost is 50,000 RS ");
	}
}

public class RunTimePolymorphism {
public static void main(String[] args) {
	Pulsar ref=new Pulsar();
	ref.information();
	
	Honda hod=new Honda();
	hod.information();
}
}
