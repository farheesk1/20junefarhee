//program for to add all elements of a list to ArrayList 

package com.jbk;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayList_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrl = new ArrayList();   
		arrl.add("First");  
		arrl.add("Second");   
		arrl.add("Third");  
		arrl.add("Random");  
		System.out.println(" Before Actual ArrayList:" + arrl);   
	   List list = new ArrayList();  
		list.add("one");  
		list.add("two");   
		arrl.addAll(list);   
		System.out.println("\n After Copy ArrayList: " + arrl); 
	}

}
