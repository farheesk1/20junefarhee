//Program for basic hashset operations 

package com.jbk;

import java.util.HashSet;

public class HashSet_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();   
		hs.add("Java");   
		hs.add("By");   
		hs.add("Kiran");   
		System.out.println(hs);  
		System.out.println(" HashSet is empty or not= " + hs.isEmpty());   
		hs.remove("Karvenagar");  
		System.out.println(hs);   
		System.out.println(" Size of HashSet= " + hs.size());  
		System.out.println(" Does HashSet contains first element= "+ hs.contains("Java"));
	}

}
