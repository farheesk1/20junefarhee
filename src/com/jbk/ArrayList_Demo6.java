//Program for to copy ArrayList into array 

package com.jbk;

import java.util.ArrayList;

public class ArrayList_Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrl = new ArrayList();   
		arrl.add("Pune");   
		arrl.add("Mumbai");   
		arrl.add("Delhi");   
		arrl.add("Nagpur");   
		System.out.println(" Actual ArrayList:" + arrl);   
		String[] strArr = new String[arrl.size()];   
		arrl.toArray(strArr);  
		System.out.println("\nCreated Array content:");   
		for (String str : strArr) {    
			System.out.println(str); 
		}
		}
	

}
