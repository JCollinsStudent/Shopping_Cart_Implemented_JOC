/**
 * The ShoppingCart class defines a data type that implements bag.
 * This class is capable of holding an array of items.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-09-01
 */
public class ShoppingCart implements Cart<Item> {
	
	// The array of items in the shopping cart.
	private ArrayBag<Item> items = new ArrayBag<Item>();
	
	/**
	 * The constructor for ShoppingCart. Instantiates a new ShoppingCart.
	 */
	public ShoppingCart(Item[] initialItems) {
		for (int i=0; i<initialItems.length; i++) {
			items.add(initialItems[i]);
		}
	}
	
	public ShoppingCart() {
		
	}
	
	/**
	 * The getter for the size variable.
	 * @return The size of the shopping cart.
	 */
	public int getSize() {
		return items.getCurrentSize();
	}
	
	/**
	 * Determines whether or not the cart is empty.
	 * @return Whether the cart is empty.
	 */
	public boolean isEmpty() {
		return items.isEmpty();
	}
	
	/**
	 * The getter for the total variable.
	 * @return The total cost of the items in the shopping cart.
	 */
	public int getTotal() {
		int total = 0;
		Item[] itemArray = this.getItems();
		for (int i=0; i<itemArray.length; i++) {
			if (itemArray[i] != null) {
				total = total + itemArray[i].getPrice();
			}
		}
		return total;
	}
	
	/**
	 * Adds an item to the shopping cart.
	 * @param item The item to be added.
	 */
	public void addItem(Item item) {
		items.add(item);
	}
	
	/**
	 * Removes an item from the shopping cart.
	 * @param itemNumber The itemNumber of the item to be removed.
	 */
	public void removeItem(int itemNumber) {
		Item[] itemArray = this.getItems();
		boolean removing = true;
		for (int i=0; i<itemArray.length; i++) {
			if (removing) {
				if (itemArray[i].getItemNumber() == itemNumber) {
					items.remove(itemArray[i]);
					removing = false;
				}
			}
		}
	}
	
	/**
	 * Gets the number of occurrences of a certain item in the items array.
	 * @param itemNumber The item to be counted.
	 */
	public int countOf(int itemNumber) {
		Item[] itemArray = this.getItems();
		int count = 0;
		for (int i=0; i<itemArray.length; i++) {
			if (itemArray[i] != null && itemArray[i].getItemNumber() == itemNumber) {
				count = items.getFrequencyOf(itemArray[i]);
			}
		}
		return count;
	}
	
	/**
	 * Empties the array of items.
	 */
	public void clear() {
		items.clear();
	}
	
	/**
	 * Getter for the items array.
	 * @return The items array.
	 */
	public Item[] getItems() {
		Object[] objectResult = items.toArray();
		Item[] itemResult = new Item[objectResult.length];
		for (int i=0; i<objectResult.length; i++) {
			itemResult[i] = (Item)objectResult[i];
		}
		return itemResult;
	}
}
