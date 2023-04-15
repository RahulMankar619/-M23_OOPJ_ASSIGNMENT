package com.example2.main;

import java.util.Scanner;



public class main {
	static Scanner sc= new Scanner(System.in);
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add New Dish");
		System.out.println("2.Remove Current Dish");
		System.out.println("3.Modify New Price for the Dish");
		System.out.println("4.View menu");
		
		return sc.nextInt();
	}
	
	public static void addMenu(Dish dish) {
		System.out.println("Enter the dish name");
		sc.nextLine();
		dish.setDishName(sc.nextLine());
		System.out.println("Enter the Price");
		dish.setPrice(sc.nextInt());
		
	}
	
	public static void main(String[] args) {
			int choice ;
			Resturant rest = new Resturant();
			while((choice = menuList()) != 0 ) {
				switch (choice) {
				case 1:
						Dish dish= new Dish();
						addMenu(dish);
						rest.addDish(dish);
					break;
				case 2:	
						System.out.println("Enter Name of dish to remove");
						sc.nextLine();
					 	boolean removed = rest.removeDish(sc.nextLine());
						System.out.println(removed? "the dish is removed" : "Dish not found");
					break;
				case 3:
						System.err.println("Enter the name of dish");
						sc.nextLine();
						rest.editPrice(sc.nextLine());
						
					break;
				case 4: rest.viewMenu();
					break;

				default:
					break;
				}
			}
	}

	

	}