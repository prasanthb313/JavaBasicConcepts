package com.string.examples;

public class ChangingUpperCase {

	public static void main(String[] args) {
		
		String name="dharanikota hyma sri durga";
		
		
	  //data type
		String[] required=name.split(" ");
		
		for(int i=0;i<=required.length-1;i++)
		{
			String ref=required[i]; //i=0 //dharanikota
			
			for(int j=0;j<=ref.length()-1;j++)
			{
				char ch=ref.charAt(j); //ch=d
				
				if(j==0)
				System.out.print(Character.toUpperCase(ch));
				else
					System.out.print(Character.toLowerCase(ch));
			}
			System.out.print(" ");
						
		}
	}
	
}

