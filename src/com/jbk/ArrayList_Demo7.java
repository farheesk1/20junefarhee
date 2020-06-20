//Program for to get sub list from ArrayList 

package com.jbk;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList  arrl = new ArrayList();   
		arrl.add("First");   
		arrl.add("Second");    
		arrl.add("Third");    
		arrl.add("Random");    
		arrl.add("Click");    
		System.out.println(" Actual ArrayList:"+arrl);    
		List list = arrl.subList(2, 4);    
		System.out.println("\n Sub List: "+list); 
	}

}
