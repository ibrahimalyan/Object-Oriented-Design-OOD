package Tar_Bait4_Question3_Solution;

public class GiftCardStrategy implements PaymentStrategy {

	private String name;
	private String code;
	private String dateOfExpiry;

	public GiftCardStrategy(String nm, String code, String expiryDate){
		this.name=nm;
		this.code=code;
		this.dateOfExpiry=expiryDate;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount +" paid with gift card");
	}

}
