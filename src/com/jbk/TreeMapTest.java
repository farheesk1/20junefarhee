package com.jbk;


import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(23, "india");
		tm.put(90, "india1");
		tm.put(45, "india2");
		tm.put(23, "india3");
		tm.put(23, "india4");
		tm.put(90, "india5");
		tm.put(23, "india6");
		tm.put(12, "india7");
		System.out.println("TreeMap");
		System.out.println(tm);
		System.out.println(tm.size());

	}

}
