package com.practicecodes.tests;

import java.util.Scanner;

public class SumOfGivenNumber {

	public static void main(String[] args) {
		
		int finalSum=0;
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in); //to take input from console
		
		System.out.println("enter a number");
		
		int userInfo=scan.nextInt();//reading the input from console
		
				
		for(int i=0;i<=userInfo;i++) 
		{
			finalSum=finalSum+i;
		}
		
		System.out.println("Final sum is  "+finalSum);
	}
}


