package Tar_Bait3_Question1_Solution;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		PaymentStrategy payment1 = PaymentFactory.getPayment("CreditCard","123456789", "123", "12/25");
		PaymentStrategy payment2 = PaymentFactory.getPayment("name@example.com","12345");
		PaymentStrategy payment3 = PaymentFactory.getPayment("Lory", "12345", 1000, "25/12");
			

		//pay by paypal
		cart.pay(payment1);
		
		ShoppingCart cart2 = new ShoppingCart();
		Item item3 = new Item("4321",11);
		Item item4 = new Item("8766",44);
		
		cart2.addItem(item3);
		cart2.addItem(item4);
		
		//pay by credit card
		cart2.pay(payment2);
		
		ShoppingCart cart3 = new ShoppingCart();
		Item item5 = new Item("1256",9);
		Item item6 = new Item("1454",23);
		
		cart3.addItem(item5);
		cart3.addItem(item6);
		
		//pay by gift card
		cart3.pay(payment3);
		
		Item item7 = new Item("2785",200);
		cart3.addItem(item7);
		
		//pay by gift card(not enough balance)
		cart3.pay(payment3);
		
	}

}
