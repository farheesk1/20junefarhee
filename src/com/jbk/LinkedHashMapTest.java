package com.jbk;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String> lm = new LinkedHashMap<>();
		lm.put(23, "india");
		lm.put(90, "india1");
		lm.put(45, "india2");
		lm.put(23, "india3");
		lm.put(23, "india4");
		lm.put(90, "india5");
		lm.put(23, "india6");
		lm.put(12, "india7");
		System.out.println("LinkedHashMap");
		System.out.println(lm);
		System.out.println(lm.size());
	}

}
