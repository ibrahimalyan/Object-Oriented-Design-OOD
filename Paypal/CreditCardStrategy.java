package Tar_Bait4_Question3_Solution;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	private String ownerId;
	
	public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate, String ownerId){
		this.name=nm;
		this.cardNumber=ccNum;
		this.cvv=cvv;
		this.dateOfExpiry=expiryDate;
		this.ownerId = ownerId;
	}
	
	@Override
	public void pay(int amount) {
		CreditCardCompany.defrayal(this, amount);
		System.out.println(amount +" paid with credit/debit card");
	}

}
