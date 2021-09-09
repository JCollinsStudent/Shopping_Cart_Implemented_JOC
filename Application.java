
public class Application {
	public static void main(String[] args) {
		ShoppingCart myCart = new ShoppingCart();
		
		Item item1 = new Item(2006837128, "Energy Drink", 3);
		myCart.addItem(item1);
		System.out.println(item1.getName() + " was added to the cart.");
		
		Item item2 = new Item(1100862036, "Shirt", 15);
		myCart.addItem(item2);
		System.out.println(item2.getName() + " was added to the cart.");
		
		Item item3 = new Item(1100815555, "Phone", 1000);
		myCart.addItem(item3);
		System.out.println(item3.getName() + " was added to the cart.");
		
		Item item4 = new Item(1100862036, "Shirt", 15);
		myCart.addItem(item4);
		System.out.println(item4.getName() + " was added to the cart.");
		
		Item item5 = new Item(1100862036, "Shirt", 15);
		myCart.addItem(item5);
		System.out.println(item5.getName() + " was added to the cart.");
		
		Item item6 = new Item(1100862092, "Gummy Bears", 1);
		myCart.addItem(item6);
		System.out.println(item6.getName() + " was added to the cart.");
		
		System.out.println("");
		
		Item[] cartArray = myCart.getItems();
		System.out.println("Cart Contents:");
		for (int i=0; i<cartArray.length; i++) {
			if (cartArray[i] != null) {
				System.out.println(cartArray[i].getName());
			}
		}
		System.out.println("");
		System.out.println("Number of shirts in the cart: " + myCart.countOf(1100862036));
		System.out.println("");
		
		myCart.removeItem(1100862036);
		
		Item[] secondCartArray = myCart.getItems();
		System.out.println("Cart Contents:");
		for (int i=0; i<secondCartArray.length; i++) {
			if (secondCartArray[i] != null) {
				System.out.println(secondCartArray[i].getName());
			}
		}
		System.out.println("");
		
		myCart.removeItem(1100862036);
		Item[] thirdCartArray = myCart.getItems();
		System.out.println("Cart Contents:");
		for (int i=0; i<thirdCartArray.length; i++) {
			if (thirdCartArray[i] != null) {
				System.out.println(thirdCartArray[i].getName());
			}
		}
		System.out.println("");
		
		myCart.removeItem(2006837128);
		Item[] fourthCartArray = myCart.getItems();
		System.out.println("Cart Contents:");
		for (int i=0; i<fourthCartArray.length; i++) {
			if (fourthCartArray[i] != null) {
				System.out.println(fourthCartArray[i].getName());
			}
		}
		System.out.println("");
		
		System.out.println("Total Cost of Items in the Cart: " + myCart.getTotal());
		System.out.println("\nIs the cart empty?: " + myCart.isEmpty());
		
		myCart.clear();
		System.out.println("Now is the cart empty?: " + myCart.isEmpty());
		
		System.out.println("Details for phone: \n itemNumber: " + item3.getItemNumber() + "\n price: " + item3.getPrice() + "\n name: " + item3.getName());
	}
}
