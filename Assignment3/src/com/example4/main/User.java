package com.example4.main;
import java.util.Scanner;

public  class User 
{  
	static int usernum=0;
	static Scanner sc= new Scanner(System.in);
  private String name;
   private String email;
  private int phone;
   int seatsBooked [] [] = new int [5][1];
   
   private void setary()
   {
	   for(int i=0;i<5;i++) {
			 for(int j=0;j<11;j++) {
				 seatsBooked[i][j]=0;
				
	 }

   }
  }
   
   
   
   
   public static void createUser(User [] userobj ) 
   {   sc.nextLine();
	   userobj[usernum]= new User();
	   System.out.println("ENTER YOUR NAME");
	   userobj[usernum].name = sc.nextLine();
	   System.out.println("ENTER YOUR EMAIL");
	   userobj[usernum].email = sc.nextLine();
	   System.out.println("ENTER YOUR PHONE NUMBER");
	   userobj[usernum].phone = sc.nextInt();
	   usernum++;
	   
   }
}

