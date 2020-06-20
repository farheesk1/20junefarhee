package com.jbk;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(23);
		ts.add(67);
		ts.add(89);
		ts.add(34);
		ts.add(12);
		ts.add(12);
		ts.add(23);
		System.out.println("TreeSet ");
		System.out.println(ts);
		System.out.println(ts.size());
	}

}
