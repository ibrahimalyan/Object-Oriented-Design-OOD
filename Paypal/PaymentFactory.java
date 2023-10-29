package Tar_Bait4_Question3_Solution;

public class PaymentFactory {
	public static PaymentStrategy getPayment(String nm, String ccNum, String cvv, String expiryDate, String ownerId){//Credit Card
		return new CreditCardStrategy(nm, ccNum, cvv, expiryDate, ownerId);
	}
	
	public static PaymentStrategy getPayment(String name, String code, String dateOfExpiry)//gift card
	{
		return new GiftCardStrategy(name, code, dateOfExpiry);		
	}
}

