package com.oopsconcepts.pages;

public class TypeCasting {

	public static void main(String[] args) {
		
		//int < long < float < double 
		
		int i =100; // scope is lees when compared to double
		
		double d=(double)i; //implicit way it will convert
		
		System.out.println("----------this is for widening ------------");
		
		System.out.println("integer value is  "+i);
		System.out.println("double value is   "+d);
		
		System.out.println("-----------this is for narrowing --------");
		
	    double k=7000.0;
	    
	    @SuppressWarnings("unused")
		int j=(int) k; //explicit way
	    
	    System.out.println("integer value is  "+j);
		System.out.println("double value is   "+k);
	}
}

