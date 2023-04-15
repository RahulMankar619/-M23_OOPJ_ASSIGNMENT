package com.example5.main;

public class InventoryItems {
	String itemName;
	int shelfNum;

	public InventoryItems(String itemName, int shelfNum) {
		this.itemName = itemName;
		this.shelfNum=shelfNum;
	}

	@Override
	public String toString() {
		return "Shelf "+this.shelfNum+":" + itemName ;
	}
	
	
	
	
	
	
}
