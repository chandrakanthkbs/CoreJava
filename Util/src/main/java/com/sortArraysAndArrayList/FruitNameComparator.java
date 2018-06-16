package com.sortArraysAndArrayList;


import java.util.Comparator;


public class FruitNameComparator implements Comparator<Fruit>{
	
	@Override
	 public int compare(Fruit f1, Fruit f2) {

         return f1.getFruitName().compareTo(f2.getFruitName());
	}

}
