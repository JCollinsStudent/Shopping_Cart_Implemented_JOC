/**
 * The bag interface defines the functions to be implemented
 * by the ShoppingCart class.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-09-01
 */
public interface Cart<T> {

	/**
	 * Getter for the size of the bag.
	 * @return The size of the bag.
	 */
	public int getSize();
	
	/**
	 * Determines whether the bag is empty.
	 * @return Whether the bag is empty.
	 */
	public boolean isEmpty();
	
	/**
	 * Getter for the total cost of the items in the bag.
	 * @return The total cost of the items in the bag.
	 */
	public int getTotal();
	
	/**
	 * Adds an item to the bag.
	 * @param item The item to be added.
	 */
	public void addItem(T item);
	
	/**
	 * Removes an item from the bag.
	 * @param itemNumber The itemNumber of the item to be removed.
	 */
	public void removeItem(int itemNumber);
	
	/**
	 * Gets the number of duplicate items of a certain type.
	 * @param itemNumber The itemNumber of the item.
	 * @return The number of instances of the item in the array.
	 */
	public int countOf(int itemNumber);
	
	/**
	 * Clears all items from the array.
	 */
	public void clear();
	
	/**
	 * Getter for the array of items.
	 * @return The array of items.
	 */
	public Item[] getItems();
}
