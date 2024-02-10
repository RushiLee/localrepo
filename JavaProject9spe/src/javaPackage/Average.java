package javaPackage;

import java.util.Scanner;

import com.beust.jcommander.converters.IntegerConverter;

public class Average {

	public static void main(String[] args) {
		
		
		 Scanner N = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter count of total number");
		    String a=N.nextLine();
		    
		    int x=Integer.parseInt(a);
		    System.out.println("confirm userInput "+a);
		   
		// int O[]=new int O[5];
		 int total=0;
		 
		 for(int i=0;i<x;i++)
		 {
			 System.out.println("Give one by one number");
		//	 O[i]=Integer.parseInt(N.nextLine());
		 }
		 //System.out.println(O[0]);
		
		
		

	}
}
