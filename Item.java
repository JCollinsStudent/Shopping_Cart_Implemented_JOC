/**
 * The item class defines an item to be added to 
 * a shopping cart.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-09-01
 */
public class Item {
	// The itemNumber (unique identifier) of the item.
	private int itemNumber;
	
	// The price of the item.
	private int price;
	
	// The name of the item.
	private String name; 
	
	/**
	 * The constructor for Item. Instantiates a new item.
	 */
	public Item(int itemNumber, String name, int price) {
		this.itemNumber = itemNumber;
		this.name = name;
		this.price = price;
	}
	
	public Item() {
		
	}
	
	/**
	 * The getter for the price variable.
	 * @return The price of the item.
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * The setter for the price variable.
	 * @param price The price to be set.
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * The getter for the name variable.
	 * @return The name of the item.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * The setter for the name variable.
	 * @param name The name to be set.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * The getter for the itemNumber variable.
	 * @return The item number.
	 */
	public int getItemNumber() {
		return itemNumber;
	}
	
	/**
	 * The setter for the itemNumber variable.
	 * @param itemNumber The item number.
	 */
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	
	/**
	 * Checks item for matching itemNumber given an object.
	 * @param An Object that can be cast as Item.
	 */
	@Override
	public boolean equals(Object itemObj) {
		Item item = (Item) itemObj;
		if (item.getItemNumber() == this.getItemNumber()) {
			return true;
		}
		else {
			return false;
		}
	}
}
