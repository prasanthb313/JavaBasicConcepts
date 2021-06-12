package com.oopsconcepts.pages;

public class CallByValue {

	int i=20; //global variable
	
	public void numberIs(int i) {
		
		i=25;
		CallByValue ref=new CallByValue();
		System.out.println(ref.i);  //20
		System.out.println(ref.i+i); //45	
		i=i+100;					 //125
		System.out.println("Number is  "+i);
		
			
	}
	
	
	// main method
	public static void main(String[] args) {
		
		CallByValue ref=new CallByValue();
		ref.numberIs(0);
		

		
	}
}




