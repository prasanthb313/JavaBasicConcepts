package com.string.examples;

public class RemovingDoubleQuotes {

	public static void main(String[] args) {
		
		//given  ---> "Symphony Summit "Bangalore" Karnataka"
		
		//output
		//Symphony
		//Summit
		//Bangalore
		//Karnataka
			
		String given="Symphony Summit \"\"Bangalore chennai\"\" Karnataka";
		System.out.println(given);
		
		String[] out=given.split("\"");
		
		System.out.println(" ");
		for(int j=0;j<=out.length-1;j++)
		{
			System.out.println(out[j]);
		}
						
		String req=given.replace("\""," ");
		
		System.out.println("string after splitting");
		System.out.println(req);
		
		String[] someRef=req.split(" ");
		
		System.out.println("===============final output========================");
		for(int i=0;i<=someRef.length-1;i++)
		{
			System.out.println(someRef[i]);
		}
	}
}

