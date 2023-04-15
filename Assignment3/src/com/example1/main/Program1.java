package com.example1.main;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	

	
	public static int sumArray(int[]arr) { 
		 int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		
		
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("Enter the elements of array");
		
		for(int i = 0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
//		for(int i : arr) {
//			System.out.println(i);
//		}
//		
		System.out.println("The array is "+Arrays.toString(arr));
		
		System.out.println("Sum is "+sumArray(arr));
		System.out.println("Average is "+avgArray(arr));
		
		
        sortArray(arr);
		
		System.out.println("The smallest element of array is "+arr[0]);
		System.out.println("The largest element of array is "+arr[arr.length-1]);
		
		
//		for(int i=(arr.length-1);i>=0;i--) {
//			System.out.println(arr[i]);
//		}
//		
		
		
		
	}

	private static void sortArray(int[]arr) {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		
	System.out.println("The sorted array is "+Arrays.toString(arr));
		
	}

	public static double avgArray(int[]arr) {
		// TODO Auto-generated method stub
		System.out.println(arr.length);
		System.out.println(sumArray(arr));
	float avg =  (sumArray(arr))/arr.length;
	return avg;
	}

}
