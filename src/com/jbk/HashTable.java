package com.jbk;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(23, "india");
		ht.put(90, "india1");
		ht.put(45, "india2");
		ht.put(23, "india3");
		ht.put(23, "india4");
		ht.put(90, "india5");
		ht.put(23, "india6");
		ht.put(12, "india7");
		System.out.println("Hashtable");
		System.out.println(ht);
		System.out.println(ht.size());

	}

}
