package com.map.examples;

import java.util.HashMap;
import java.util.Map;

public class MapPutAndReplace {

	public static void main(String[] args) {
		Map<Integer, String> ref=new HashMap<Integer, String>();
		
		ref.put(1,"Baddepudi"); // for passing values into the map
		
		//changing the value based on key, if u know the key exactly in the sense
		
		ref.replace(2,"Prasanth");
		
		System.out.println(ref.get(2));
		
	}
}


