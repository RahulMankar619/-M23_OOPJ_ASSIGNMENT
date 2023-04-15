package com.example5.main;

import java.util.*;

public class WarehouseInventory {
	
	public static Scanner sc= new Scanner(System.in);
	static InventoryItems[] items= new InventoryItems[3];
	
	public static void addItem() {
		 if(isEmpty()) {
				sc.nextLine();
				System.out.println("Please enter the name of the item:");
				String itemName= sc.nextLine();
				while (true) {
					System.out.println("Please enter the shelf number :");
					int shelfNum= sc.nextInt();
					
					if(shelfNum>0 && shelfNum<=items.length) {
						if(items[shelfNum-1]== null) {
							items[shelfNum-1]=new InventoryItems(itemName, shelfNum);
							System.out.println("Item '"+ itemName +"' added to shelf "+shelfNum+".");
							break;
						}
						else {
							System.out.println("You cannot add to shelf"+shelfNum+" ..it is occupied.\n"
									+ "Enter 0 if you still want to add \n"
									+ "Enter 1 if you dont want to add");
							if (sc.nextInt()==0) {
								continue;
							} else {
								break;
							}
						}
					}else {
						System.out.println("Please enter the correct number");
						continue;
					}	
				}		
		}
		else 
			System.out.println("Shelf is not Empty");
		
		
	}
	
	
	public static boolean isEmpty() {
		
		for (int i = 0; i < items.length; i++) {
			if (items[i]==null) {
				return true;
			}
			
		}
		return false;
		
	}
	
	public static void removeItem() {
		System.out.println("\n Choose the option from following to remove\n"
				+ "====================================================");
		displayContent();
		int option = sc.nextInt();
		if (option>0 && option<=items.length) {
			if (items[option-1]!=null) {
				items[option-1]=null;
				System.out.println("Item is removed successfully..");
			} else {
				System.out.println("There is no item at choosen option..!!");
			}
		} else {
			System.out.println("Invalid option entered..Returning to main..!!");
		}
		
		
		
	}
	
	private static void displayContent() {
		System.out.println("Current contents of all shelves:"); 
		for (int i = 0; i < items.length; i++) {
			if (items[i] ==null) {
				System.out.println("Shelf "+(i+1)+" :[empty]");
			} else {
				System.out.println(items[i]);
			}
			
		}

		
	}

	public static int viewMenu() {
		
		System.out.println("\n Choose the option from following:\n"
				+ "====================================================\n"
				+ "1.Add item to shelf\n"
				+ "2.Remove item from shelf\n"
				+ "3.Display contents of all shelves\n"
				+ "4.Exit\n");
		int choice = sc.nextInt();
		return choice;
		
	}
	
	
	public static void main(String[] args) {
		
		boolean loop=true;
		while (loop) {
			switch (viewMenu()) {
			case 1:
				addItem();
				break;
				
			case 2:
				removeItem();
				break;
			
			case 3:
				displayContent();
				break;
			
			case 4:
				loop=false;
				System.out.println("Thank you for using the Warehouse Inventory Management System!\n");
				break;
				
			default:
				System.out.println("Invalid option entered..!!Please enter again..");
				break;
			}
		}
		
	}


	

}

