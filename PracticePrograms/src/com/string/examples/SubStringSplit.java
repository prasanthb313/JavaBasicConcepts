package com.string.examples;

public class SubStringSplit {

	public static void main(String[] args) {
	//	String s="\"abc adf mnq "asdf asd asfasd" asd "asdffgh asdf"\";
		
		
		String s="abc adf mnq asdf asd asfad anb vnn ";
		String s2="abc adf\"mnq\"asdf";
		System.out.println(s2);
		String req=s2.replace("\"", " ");
		System.out.println(req);
		String[] last=req.split(" ");
		
		System.out.println("-----------print using for each loop---------------");
		for(String abc:last)
		{
			System.out.println(abc);
		}
		System.out.println("----------using for loop----------");
		for(int i=0;i<=last.length-1;i++)
		{
			System.out.println(last[i]);
		}
	}
}



