//Simple program for Hashmap Demo 

package com.jbk;

import java.util.HashMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<K, V> hm = new HashMap();        
		HashMap<String, String> hm = new HashMap<String, String>(); 
		//key and value both are in string type   
		hm.put("one", "Java");        
		hm.put("two", "By");        
		hm.put("three","Kiran");         
		System.out.println(hm);         
		System.out.println("Value of second:= "+hm.get("two"));   
		//get element from hashmap using key         
		System.out.println("Is HashMap empty:= "+hm.isEmpty());   
		//check hashmap is empty or not        
		hm.remove("third");       
		//delete element from hasmap         
		System.out.println(hm);         
		System.out.println("Size of the HashMap:= "+hm.size());    
		//size of hashmap 
	}

}
