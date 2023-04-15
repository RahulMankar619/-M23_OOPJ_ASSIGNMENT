package com.example4.main;
import java.util.*;

public class Functions {
	static int row ,col;
	static Theatre tobj = new Theatre();
	User userobj1 = new User();  
	static Scanner sc = new Scanner(System.in);
	
	
	   static int userMenu() 
	   {
		
		System.out.println("0 . EXIT");
		System.out.println("1 . CREATE USER");
		System.out.println("2 . CHECK SEAT AVAILABILITY");
		System.out.println("3 . BOOK TICKET");
		System.out.println("4 . CHECK COUNT OF AVAILABLE SEATS");
		System.out.println("5 . GET TOTAL REVENUE");
		System.out.println("ENTER CHOICE");
		return sc.nextInt();
		
       }
	public static  void bookTicket(User userary[],int usernum) 
    { 
	   
	try {
		int index=0;
		while(index<4 && ((row=tobj.displaySeats())!=0))
		{     
			
			  System.out.println("ENTER THE SEAT NUMBER IN "+row+" row");
			  col=sc.nextInt();
			  if(tobj.checkSeat(row, col))
			   {
			  userary[usernum].seatsBooked[row][col]=1;
			  tobj.fillSeats(row,col);
			   if(col>10||col%2==0) 
			    {
				System.out.println("SEAT NOT AVAILABLE");
			     }
			        else 
			       {
			
			        index++;
			         }
//			else {
//				   System.out.println("SEAT ALREADY TAKEN");
//			}
		}
	   }
		
		if(index>=4) 
		{
			System.out.println("YOU CAN BOOK MAX 4 SEATS WITH 1 ID");
		}
		
	}
	catch(Exception e) {
		System.out.println("CHUP CHAP 4 book krle bs");
	}
  }
	
	
	
	
	
	
	
	
}

