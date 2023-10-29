package Tar_Bait4_Question3_Solution;

import java.util.Random;

public class CreditCardCompany {

	public static void defrayal(Tar_Bait4_Question3_Solution.CreditCardStrategy creditCardStrategy, int amount )
	{
		Random random = new Random();
		boolean success = random.nextBoolean();//try to charge the credit card
		System.out.println("Try to charge the credit card");

		while (!success) 
		{
			System.out.println("Try to charge again.");
			success = random.nextBoolean();
		} 
	}
}
