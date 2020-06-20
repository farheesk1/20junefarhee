//program to read all elements in ArrayList by using an iterator 

package com.jbk;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrl = new ArrayList<>();   
		// adding elements to the end0   
		arrl.add("Pune");   
		arrl.add("Mumbai");   
		arrl.add("Aurangabad");  
		arrl.add("Nagpur");       
		Iterator<String> itr = arrl.iterator();   
		while (itr.hasNext()) {   
			System.out.println(itr.next());  
			}      
	}

}
