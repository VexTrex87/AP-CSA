
import java.util.ArrayList;

public class Invoice {

	private ArrayList<Item> items;
	
	public Invoice() {
		items = new ArrayList<Item>();
	}
	
	public void add(Item anItem) {
		items.add(anItem);
	}
	
	public double getDiscount() {
		int numPets = 0;
		int numOtherItems = 0;
		double costOtherItems = 0;
		double discount = 0;
		
		for (int i = 0; i < items.size(); i++) {
			Item item = items.get(i);

			int quantity = item.getQuantity();
			boolean isPet = item.getIsPet();

			if (isPet == true) {
				numPets += quantity;
			} else {
				numOtherItems += quantity;

				double price = item.getPrice();
				costOtherItems += price;
			}
		}
		
		if (numPets >= 1 && numOtherItems >= 5) {
			discount = costOtherItems * 0.20;
		} else {
			discount = 0;
		}
		
		return discount;
	}
	
}
