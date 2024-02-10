package javaPackage;

import java.util.ArrayList;
import java.util.Collections;

public class ArraList1 {

	public static void main(String[] args) {
		ArrayList<String>  arl=new ArrayList<String>();
		ArrayList<Object>  Orl=new ArrayList<Object>();
		
		Orl.add(0);
		Orl.add("Hero");
		Orl.add("Orochimaru");
		Orl.add(1000);
			/*for(Object i:Orl) {
				System.out.println(i);
			}*/
		System.out.println(Orl);
		
		//add elemenet
		Orl.add("Makisa");
		System.out.println(Orl);
		
		//get element
		System.out.println(Orl.get(2));
		
		//Modify Element
	Orl.set(1, "Vilian");
	System.out.println(Orl);
	
	//Remove Element
	Orl.remove(3);
	System.out.println(Orl);
	
	//Size of ArrayList
	System.out.println(Orl.size());
	
	
	arl.add("Bapu");
	arl.add("Naggu");
	arl.add("Champu");
	arl.add("Pingu");
	System.out.println(arl);
	Collections.sort(arl);
		
		System.out.println(arl);		
}
}