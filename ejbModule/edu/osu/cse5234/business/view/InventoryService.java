package edu.osu.cse5234.business.view;

public interface InventoryService {
	public Inventory getAvailableInventory();
	
	public boolean validateQuantity(int itemId, int quantity);
	
	public boolean updateInventory();//Collection<Item> items);
}
