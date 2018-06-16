package com.sortArraysAndArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingArrayList {

	public static void main(String[] args) {

		
		Fruit pineappale = new Fruit("Pineapple", "ine description",70); 
		Fruit apple = new Fruit("Apple", "led description",100); 
		Fruit banana = new Fruit("Banana", "nap description",90);
		Fruit orange = new Fruit("Orange", "eas description",80); 
		
		ArrayList<Fruit> fruitsList = new ArrayList<Fruit>(2);
		fruitsList.add(pineappale);
		fruitsList.add(apple);
		fruitsList.add(orange);
		fruitsList.add(banana);
		
	
		Collections.sort(fruitsList, new FruitQuantityComparator());
 		
		//Sort by Desc with Comparator interface in separate class.
		Collections.sort(fruitsList, new FruitDescComparator());
		
		//Sort by Name with Comparator interface Adaptor method. 	
		Collections.sort(fruitsList, new Comparator<Fruit>(){

			@Override
			public int compare(Fruit f1, Fruit f2) {
				// TODO Auto-generated method stub
				return f1.getFruitName().compareTo(f2.getFruitName());
			}
		});
		
		//Sort by Quantity using Comparable Interface
		//Collections.sort(fruitsList);
				
		
		for (Fruit fruit : fruitsList) {
		System.out.println(fruit.getFruitName()+  "  "+ fruit.getFruitDesc()+"  "+fruit.getQuantity());	
		}
	}

}
