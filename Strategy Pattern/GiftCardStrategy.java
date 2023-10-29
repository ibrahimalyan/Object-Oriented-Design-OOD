package Tar_Bait3_Question1_Solution;

public class GiftCardStrategy implements PaymentStrategy {

	private String name;
	private String code;
	private int balance;
	private String dateOfExpiry;
	
	public GiftCardStrategy(String nm, String code, int balance, String expiryDate){
		this.name=nm;
		this.code=code;
		this.balance=balance;
		this.dateOfExpiry=expiryDate;
	}
	
	@Override
	public void pay(int amount) {
		if (amount <= balance)
		{
			System.out.println(amount +" paid with gift card");
			balance -= amount;
		}
		else
		{
			System.out.println("Your balance is not enough.");
		}
		
	}

}
