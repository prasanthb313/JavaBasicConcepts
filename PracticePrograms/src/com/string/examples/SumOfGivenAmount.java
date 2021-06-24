package com.string.examples;

import java.util.ArrayList;
import java.util.List;

public class SumOfGivenAmount {

	public static void main(String[] args) {
		
		double sum=0;
		List <String> list=new ArrayList<String>();
		
		list.add("RS 1234.56");
		list.add("RS 5678.89");
		list.add("RS 7654.90");
		
		for(int i=0;i<list.size();i++)
		{
		
			String ref=list.get(i);
			String[] req=ref.split(" ");
			for(int j=req.length-1;j>=0;)
			{
				String amount=req[j];
				
				double money=Double.parseDouble(amount);
				sum=sum+money;
				break;
			}
		}
		System.out.println(sum);
	}
}


