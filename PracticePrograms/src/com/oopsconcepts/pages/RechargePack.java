package com.oopsconcepts.pages;



public class RechargePack {

	private int recharge; // 1) constant variable

	public void setRecharge(int recharge) {  // generating set method
		this.recharge = recharge;
		
		//implementing the logic
		
		if(recharge>=100) {
			
			if(recharge>=100&&recharge<=200) {
				System.out.println("you will get recharge validity for one month");
			}
			else if(recharge>=200&&recharge<=300)
			{
				System.out.println("you will get recharge validity for two months");
			}			
						
		    System.out.println("recharge is successful");
		}
		else
		{
			System.out.println("Not able to recharge because this pack price is more than 100  but you tried to "
					+ "recharge with  "+recharge);
		}
	}		
}

