package Tar_Bait5_Total_Solution;

import java.util.*;

public class Bill {

	private HashMap<String, Double> mProductsMap = new HashMap<>();
	private double mGlobalDiscount = 100;
	
	public void addProduct(String name, double amount)
	{
		mProductsMap.put(name, amount);
	}
	public void changeAmount(String name, double amount)
	{
		if (mProductsMap.containsKey(name)) {
			mProductsMap.replace(name, amount);
		}
	}
	public void removeProduct(String name)
	{
		mProductsMap.remove(name);
	}
	public double getSum()
	{
		double sum = 0;
		// method 2 in https://www.geeksforgeeks.org/traverse-through-a-hashmap-in-java/
		for (Map.Entry<String, Double> mapElement : mProductsMap.entrySet()) {
			sum +=  ProductCatalog.getProductPrice(mapElement.getKey())*mapElement.getValue();
		}
		sum = sum* (mGlobalDiscount/100);
		return sum;     
	}
	public int getNumberOfProducts()
	{
		return mProductsMap.size();
	}
	public double getAmountForProduct(String name)
	{
		if (mProductsMap.containsKey(name)) {
			return mProductsMap.get(name);
		} 
		return 0;
	}
	public void setGlobalDiscount(double discount)
	{
		mGlobalDiscount = discount;
	}
	

}
