package com.oopsconcepts.pages;

public class CreateObject2 {
int i=10;
String name="prasanth";
  public static void main(String[] args) {
	  CreateObject2 ref1=new CreateObject2();
	  CreateObject2 ref2=new CreateObject2();
	  
	  ref2.i=30;
	  
	  System.out.println(ref1.i);//10
	  
      System.out.println(ref2.i);//30
	  System.out.println("Number is  "+ref1.i +" "+"name is  "+ref1.name);
}
}
