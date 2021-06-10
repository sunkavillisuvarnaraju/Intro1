package com.nani.logicalprograming;

import java.util.Scanner;

//intialize the values into array from enduser

public class ArrayTest5 {
 
	public static void main(String[] args)  {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number of Locations of Array::");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Elements::");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements are::");
		for(int ele : arr) {
			System.out.print(" "+ele);
		}
}
	
	
}
