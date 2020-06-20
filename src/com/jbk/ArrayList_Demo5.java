//program for to find does ArrayList contains all list elements or not 

package com.jbk;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrl = new ArrayList();   
		arrl.add("First");  
		arrl.add("Second");   
		arrl.add("Third");   
		arrl.add("Random");   
		List list = new ArrayList();   
		list.add("Second"); 
		list.add("Random");  
		System.out.println(" Does ArrayList contains all list elements?: "     + arrl.containsAll(list));   
		list.add("one"); 
		System.out.println("\n Does ArrayList contains all list elements?: "     + arrl.containsAll(list)); 
	}

}
