package com.jbk;

import java.util.HashSet;


public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		hs.add(23);
		hs.add(67);
		hs.add(89);
		hs.add(34);
		hs.add(12);
		hs.add(12);
		hs.add(23);
		System.out.println("HashSet ");
		System.out.println(hs);
		System.out.println(hs.size());

	}

}
