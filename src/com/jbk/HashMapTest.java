package com.jbk;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(23, "india");
		hm.put(90, "india1");
		hm.put(45, "india2");
		hm.put(23, "india3");
		hm.put(23, "india4");
		hm.put(90, "india5");
		hm.put(23, "india6");
		hm.put(12, "india7");
		System.out.println("HashMap");
		System.out.println(hm);
		System.out.println(hm.size());
		
		

	}

}
