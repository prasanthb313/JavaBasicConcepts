package com.string.examples;

public class StringImmutable {

	public static void main(String[] args) {
		
		String s="name";	
		
		/*for(int i=0;i<s.length();i++)
		{
			char letter=s.charAt(i);
			if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
			{
				System.out.print(Character.toUpperCase(letter));
			}
			else
				System.out.print(letter);
		}*/
		
		
		for(int i=0;i<s.length();i++)
		{
			char letter=s.charAt(i);
			if(letter>=97&&letter<=123)
			{
				System.out.print(Character.toUpperCase(letter));
			}
			else
				System.out.print(letter);
		}
	}
}







