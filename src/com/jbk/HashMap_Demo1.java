//Program for copy Map content to another HashMap

package com.jbk;

import java.util.HashMap;

public class HashMap_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();   
		hm.put("first", "Java");        
		hm.put("second", "By");        
		hm.put("third","Kiran");        
		System.out.println(hm);        
		HashMap<String, String> hm1 = new HashMap<String, String>();        
		hm1.put("c1", "JAVA");        
		hm1.put("c2", "SELENIUM");         
		hm.putAll(hm1);         
		System.out.println(hm);   
	}

}
