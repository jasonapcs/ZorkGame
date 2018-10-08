package Zork;

public class inventory {
	
	public inventory() {
		inventoryList = new items[12];
	}
	
	public void pickUpItem(items i) {
		if (calcInvWeight() < 100) {
			
		}
	}
	
	private long calcInvWeight() {
		long currentWeight = 0;
		for (items i : inventoryList) {
			currentWeight += i.weight;
		}
		return currentWeight;
	}
	
	public items[] inventoryList;
}
