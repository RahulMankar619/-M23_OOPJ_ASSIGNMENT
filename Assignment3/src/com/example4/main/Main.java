package com.example4.main;

import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
		User [] userary = new User [5];
		Scanner sc = new Scanner(System.in);
		int choice;
		while((choice=Functions.userMenu())!=0) {
			switch(choice) {
			    case 1 : User.createUser(userary);
			   
			    break;
				case 2 : Theatre.displaySeats();
				break;
				case 3 :System.out.println("enter user number");
				      int usernum = sc.nextInt();
					    Functions.bookTicket(userary,usernum);
					    break;
				case 4 :Theatre.availSeatCount();
				break;
				case 5 :Theatre.generateRevenue();
				break;
			}
		}
	}
	}

