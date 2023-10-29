package Tar_Bait5_Total_Solution;

import java.util.*;

public class ProductCatalog {
	// https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
	static private HashMap<String, Double> mProductsMap = new HashMap<>();
	static public void addProduct(String name, double price)
	{
		mProductsMap.put(name, price);
	}
	static public double getProductPrice(String name)
	{
		if (mProductsMap.containsKey(name)) 
		{			 
            return mProductsMap.get(name);
        }
		
		return 0;
	}
	static public void clear()
	{
		mProductsMap.clear();
	}
}
