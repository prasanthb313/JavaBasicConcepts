package com.string.examples;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		
		String name="prasanth";
		
		
		for(int i=0;i<=name.length()-1;i++)
		{
			int count=0;
			char ch=name.charAt(i);
			
			for(int j=0;j<name.length();j++)
			{
				char req=name.charAt(j);
				
				if(ch==req)
				{
					count++;
				}
			}
			System.out.println("the letter   "+ch+"  appeared "+count+" times ");
			
		}
	}
}

