//program for compare two sets and retain elements which are same on both hashsets 

package com.jbk;

import java.util.HashSet;

public class HashSet_Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();   
		hs.add("Java");  
		hs.add("By");   
		hs.add("Kiran");   
		hs.add("karvenagar");  
		hs.add("pune");   
		System.out.println("First Hashset:= "+hs);   
		HashSet subSet = new HashSet();   
		subSet.add("Java");   
		subSet.add("J2EE");   
		subSet.add("Selenium");   
		System.out.println("Second Hashset:= "+subSet);   
		hs.retainAll(subSet);   
		//this function retain common element from both hashset   
		System.out.println("" + "Common Hashset content from both:");   
		System.out.println(hs); 
	}

}
