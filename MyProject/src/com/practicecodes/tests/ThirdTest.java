package com.practicecodes.tests;

import com.reusablemathods.pages.StateName;

public class ThirdTest {
public static void main(String[] args) {
	StateName state=new StateName();//object creation to the class
	state.stateProgress("Nellore", 2); // calling the method
	state.stateProgress("Nellor", 6);
	
}
}
