package Tar_Bait3_Question1_Solution;

public class PaymentFactory {
	public static PaymentStrategy getPayment(String nm, String ccNum, String cvv, String expiryDate){//Credit Card
		return new CreditCardStrategy(nm, ccNum, cvv, expiryDate);
	}
	
	public static PaymentStrategy getPayment(String email, String pwd){// Paypal
		return new PaypalStrategy(email, pwd);
	}
	
	public static PaymentStrategy getPayment(String name,String code,int balance,String dateOfExpiry)//gift card
	{
		return new GiftCardStrategy(name, code, balance, dateOfExpiry);		
	}
}

