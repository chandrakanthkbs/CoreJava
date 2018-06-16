package com.sortArraysAndArrayList;


import java.util.Comparator;


public class FruitDescComparator implements Comparator<Fruit>{
	
	@Override
	 public int compare(Fruit f1, Fruit f2) {

         return f1.getFruitDesc().compareTo(f2.getFruitDesc());
	}

}
