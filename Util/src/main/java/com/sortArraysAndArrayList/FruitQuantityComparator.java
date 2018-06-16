package com.sortArraysAndArrayList;


import java.util.Comparator;


public class FruitQuantityComparator implements Comparator<Fruit>{
	
	@Override
	 public int compare(Fruit f1, Fruit f2) {
		
		// ascending order
		return f1.getQuantity() - f2.getQuantity();

	}

}
