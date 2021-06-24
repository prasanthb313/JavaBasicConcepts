package com.string.examples;

public class StringDivide {

	public static void main(String[] args) {
		String name="hyma sri durga";
		
		String [] req=name.split(" ");
		
		for (int i=0;i<req.length;i++) 
		{
			String output=req[i];
			
			for (int j=0;j<output.length();j++)
			{
				char ch=output.charAt(j);
				if(j==0)
				{
					System.out.print(Character.toUpperCase(ch));
				}
				else
					System.out.print(ch);
			}
			
		}
		
	}
}



