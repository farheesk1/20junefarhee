package com.jbk;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<>();
		lh.add(23);
		lh.add(67);
		lh.add(89);
		lh.add(34);
		lh.add(12);
		lh.add(12);
		lh.add(23);
		System.out.println("LinkedHashSet ");
		System.out.println(lh);
		System.out.println(lh.size());

	}

}
