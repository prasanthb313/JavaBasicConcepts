package com.collections.exaples;

public class ArrayExample {

	public static void main(String[] args) {
		
		//case 1
		int[] ref=new int[15];
		
		ref[0]=10;
		ref[1]=20;
		ref[2]=30;
		ref[3]=50;
		
		
		for(int i=0;i<=ref.length-1;i++)
		{
			System.out.println(ref[i]);
		}
		
		//case 2
		int[] ref2=new int [4];
		
		ref2[0]=100;
		ref2[1]=100;
		ref2[2]=100;
		ref2[3]=100;
		
		for(int j=0;j<=ref2.length-1;j++)
		{
			System.out.println(ref2[j]);
		}
		
		// we need to declare the size of the array 
		
	}
}


