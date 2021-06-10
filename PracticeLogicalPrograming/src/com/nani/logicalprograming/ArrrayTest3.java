package com.nani.logicalprograming;

import java.util.Scanner;

//Display the values in the array Read those values from the EndUser using ForEach Loop 

public class ArrrayTest3 {
	
    public static void main(String[] args) {
      int[] ar = new int[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Elements::");
      for(int i=0;i<ar.length;i++) {
    	  ar[i]=sc.nextInt();
    }
      System.out.println("Elements are::");
      for(int ele : ar) {
    	  System.out.print(" "+ele);
      }
    
    }
		
}
