package Zork;

public class player {
	
	public static void init() {
		inventory = new items[12];
	}
	
	public static void pickUpItem(items i) {
		if (calcInvWeight() < 100) {
			
		}
	}
	
	private static long calcInvWeight() {
		long currentWeight = 0;
		for (items i : inventory) {
			currentWeight += i.weight;
		}
		return currentWeight;
	}
	
	public static items[] inventory;
	

}
