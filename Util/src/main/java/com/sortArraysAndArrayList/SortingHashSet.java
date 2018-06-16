package com.sortArraysAndArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SortingHashSet {
	
	public static void main(String args[])
	{
	
		Fruit pineappale = new Fruit("Pineapple", "ine description",70); 
		Fruit apple = new Fruit("Apple", "led description",100); 
		Fruit banana = new Fruit("Banana", "nap description",90);
		Fruit orange = new Fruit("Orange", "eas description",80);
		Fruit orange1 = new Fruit("Orange", "eas description",80);
		
		HashSet<Fruit> fruitset = new HashSet<Fruit>();
		fruitset.add(pineappale);
		fruitset.add(apple);
		fruitset.add(orange);
		fruitset.add(orange1);
		fruitset.add(banana);
	
		
		Set<Fruit> treeSet = new TreeSet<Fruit>(new FruitNameComparator());	 
		treeSet.addAll(fruitset);
		
		for(Fruit fruit:fruitset){
			System.out.println(fruit.getFruitName()+  "  "+ fruit.getFruitDesc()+"  "+fruit.getQuantity());	
			}
	}
}
