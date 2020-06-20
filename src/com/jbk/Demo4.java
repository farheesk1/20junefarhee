//program for to delete all elements from ArrayList 

package com.jbk;

import java.util.ArrayList;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrl = new ArrayList();   
		arrl.add("Zero");   
		arrl.add("First");   
		arrl.add("Second");   
		arrl.add("Third");  
		arrl.add("Random");   
		System.out.println(" Actual ArrayList:" + arrl);   
		arrl.clear(); 
		// this function delete all items from arraylist   
		System.out.println("\n After clear ArrayList:" + arrl);  

	}

}
