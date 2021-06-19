package com.string.examples;

public class StringSplitting {

	public static void main(String[] args) {
		String name="Hyma;Symphony;QA;Bangalore;STATE;District;ExactLocation";
		
		String [] info=name.split(";");
		

					   //6
		for(int i=0;i<=info.length-1;i++)
		{
			System.out.println(info[i]);
			
		}
	}
}



