package com.string.examples;

public class CountingSpecialCharacters {

	public static void main(String[] args) {
		
		String name="prasanth 123     B";
		
		int lowerCase=0,upperCase=0,splCharacters=0,space=0;
		
		
		for(int i=0;i<=name.length()-1;i++)
		{
			char ch=name.charAt(i);
			
			if(ch>='a'&&ch<='z')
				lowerCase++;
			else if(ch>='A'&&ch<='Z')
				upperCase++;
			else if (ch==' ')
				space++;
			else
				splCharacters++;
		}
		
		System.out.println("lower case letters in the given string is  "+lowerCase);
		System.out.println("upper case letters in the given string is  "+upperCase);
		System.out.println("space in the given string is  "+space);
		System.out.println("spl characters in the given string is  "+splCharacters);
	}
}
