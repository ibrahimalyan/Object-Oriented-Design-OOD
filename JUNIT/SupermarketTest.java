package Tar_Bait5_Total_Solution;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class SupermarketTest {
	protected Bill mbill = new Bill();
	protected static int i = 0;
	
	@BeforeEach
	public void setUp()
	{
		ProductCatalog.addProduct("Milk", 5.0);
		ProductCatalog.addProduct("Bread", 3.0);
		ProductCatalog.addProduct("Butter", 2.0);		
	}
	@AfterEach
	public void end()
	{
		ProductCatalog.clear();
	}
	
	@Test
	public void testExampleBill()//test1
	{		
		mbill.addProduct("Milk", 2);
		mbill.addProduct("Bread", 3);
		mbill.addProduct("Butter", 1);
		Assertions.assertEquals(mbill.getSum(), 21);
	}
	@Test
	void testEmptyBill()//test2
	{
		Assertions.assertEquals(mbill.getSum(), 0);
	}
	@Test
	void testAddAndRemove()//test3
	{
		mbill.addProduct("Milk", 2);
		mbill.removeProduct("Milk");
		Assertions.assertEquals(mbill.getSum(), 0);
	}
	@Test
	void testNumberOfProducts()//test4
	{
		mbill.addProduct("Milk", 2);
		mbill.addProduct("Bread",4);
		Assertions.assertEquals(mbill.getNumberOfProducts(), 2);
	}
	@Test
	void testDiscount()//test5
	{
		mbill.addProduct("Milk", 2);
		mbill.addProduct("Bread",4);
		double beforeDiscountSum = mbill.getSum();
		mbill.setGlobalDiscount(50);
		double afterDiscountSum = mbill.getSum();
		Assertions.assertEquals(beforeDiscountSum , afterDiscountSum*2);
	}
	@Test
	void testChangeAmountTwice()//test6
	{
		mbill.addProduct("Milk", 2);
		mbill.changeAmount("Milk", 4);
		mbill.changeAmount("Milk", 6);
		Assertions.assertEquals(mbill.getAmountForProduct("Milk"), 6);
	}
	@Test
	void testAmountForProductNotInBill()
	{
		mbill.addProduct("Milk", 2);
		Assertions.assertEquals(mbill.getAmountForProduct("Bread"), 0);
	}
	

}
