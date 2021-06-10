package com.nani.logicalprograming;

//Applicaton is to find the element in the given array

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element to search::");
		int key=sc.nextInt();
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				found=true;
				System.out.println("Element "+key+"found at::"+i);
			}
	}
		if(!found) {
			System.out.println("Element not found::");
		}
		
	}
	
}
