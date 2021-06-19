package com.oopsconcepts.pages;


public class Encapsulation {

	private int a;		 //1) constant  declaration
	private String name; //1) constant
	
	public int getA() {   //2) Generate getters and setters
		return a;
	}
	
	public void setA(int a) {
		this.a = a;		
		if(a<100) {
			System.out.println("This recharge option is not available for your mobile");
		}
		else
		{
			System.out.println("Recharge is completed successfully");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		 
	public static void main(String[] args) {
		
		Encapsulation encap=new Encapsulation();
		encap.setA(99);	
	}
}





