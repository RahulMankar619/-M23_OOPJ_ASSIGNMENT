package com.example4.main;

import java.util.Scanner;

public class Theatre {
	 static int seats [] [] = new int[5][11];
	 static long revenue;
	 static Scanner sc= new Scanner(System.in);
	 
	 User userobj = new User();
	 
	 private static void createArrangment() {
		 for(int i=0;i<5;i++) {
			 for(int j=0;j<11;j++) {
				 if(j==0) {
					seats [i][j]=j;
				 }
				 else if(j%2==0) {
					 seats[i][j]=1;
				 }
				 else {
					 seats[i][j]=0;
				 }
			 }
		 }
	 }
	 

	  boolean checkSeat(int row , int col) {
		   if(seats[row][col]==2)
			   return false;
		   else
		  return true;
	  }
	   public static int displaySeats() 
	   {  
		   createArrangment();
		   int k=0;
		   for(int i =0;i<seats.length;i++) {
			   for(int j=0;j<seats[i].length;j++) 
			   {
			  
	               	if(seats[i][j]==1) {
	               		System.out.print("F ");
	               	}
	               	else if(j==0)
	               	{   
	               		System.out.print(k+" ");
	               	 k++;
	               	}
	               	else {
	               		System.out.print(j+" ");
	               	}
				
		   }
			   System.out.println();
		   }
		   System.out.println("ENTER THE ROW NUMBER  PRESS 0 TO STOP ");
		   return sc.nextInt();
	   
	   }
	   
	   public void fillSeats(int row,int col) 
	   {
		 seats[row][col]=2;
	   }
	static void generateRevenue() {
		   int count=0;
		   for(int i =0;i<5;i++)
		   {
			   for(int j=0;j<11;j++) {
				   if(j==0)
					   continue;
				   else if(seats[i][j]==2) {
					    revenue+=100;
					    count++;
				   }
			   }
			  
		   }
		   System.out.println("TOTAL SEATS SOLD ARE "+count);
		   System.out.println("TOTAL REVENUE GENERATED IS "+revenue);
	   }
	 static void availSeatCount() {
		 int count =0;
		 for(int i =0;i<5;i++)
		   {
			   for(int j=0;j<11;j++) {
				   if(j==0)
					   continue;
				   else if(seats[i][j]==0) {
					    count+=1;
				   }
			   }
			  
		   }
		 System.out.println("AVAILABLE SEATS ARE "+count);
		 
		 
		 
	 }
	 
	 
	}
