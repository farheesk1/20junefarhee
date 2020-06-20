//Program for Iterating through each key get corresponding value object 

package com.jbk;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();   
		hm.put("first", "Java");   
		hm.put("second", "By");  
		hm.put("third", "Kiran");   
		System.out.println(hm);   
		Set<String> keys = hm.keySet(); 
		 
		  for (String key : keys) {   
			  System.out.println("Value of " + key + " is: " + hm.get(key)); 
		  }
	}

}
