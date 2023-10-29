package Tar_Bait4_Question3_Solution;

import java.util.Iterator;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		PaymentStrategy payment1 = PaymentFactory.getPayment("CreditCard","123456789", "123", "12/25", "111112222");
		PaymentStrategy payment2 = PaymentFactory.getPayment("Lory", "12345", "25/12");
			
		//pay by credit card
		cart.pay(payment1);
		
		ShoppingCart cart2 = new ShoppingCart();
		Item item3 = new Item("4321",11);
		Item item4 = new Item("8766",44);
		
		cart2.addItem(item3);
		cart2.addItem(item4);
		
		//pay by gift card
		cart2.pay(payment2);
		
		Iterator<Item> iterator = cart2.items.iterator();
		String element;
		while (iterator.hasNext()) {
			Item i = iterator.next();
		     element ="item: " + i.getUpcCode() +" cost: " +i.getPrice();
		    System.out.println(element);
		}
		System.out.println("Total price: " + cart2.calculateTotal());
	}
}
