package com.reusablemathods.pages;

public class StateName {
	
public void stateProgress(String name,int rank) {

	
	if(name.equals("Nellore")) {
		System.out.println("Person belongs to Nellore distring and pincode is 524308");
	}
	else{
		System.out.println("Person Not belongs to Nellore district and pincode is wrong");
	}
		
	if(rank<=5) {
		System.out.println("district development is low");
	}
	else {
		System.out.println("district development is high");
	}
}
 
}
