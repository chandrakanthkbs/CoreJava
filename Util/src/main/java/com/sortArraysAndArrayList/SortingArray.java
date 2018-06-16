package com.sortArraysAndArrayList;
import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {

		Fruit pineappale = new Fruit("Pineapple", "ine description",70); 
		Fruit apple = new Fruit("Apple", "led description",100); 
		Fruit banana = new Fruit("Banana", "nap description",90);
		Fruit orange = new Fruit("Orange", "eas description",80); 
		
		Fruit[] fruitsArray = new Fruit[4];

		fruitsArray[0] = pineappale;
		fruitsArray[1] = apple;
		fruitsArray[2] = orange;
		fruitsArray[3] = banana;

		// Compare using quantity
		Arrays.sort(fruitsArray,new FruitQuantityComparator());
		for (Fruit temp : fruitsArray) {
			System.out.println(temp.getFruitName() + ":" + temp.getQuantity());
		}

		//Sort by Name with Comparator interface.
		System.out.println("--------Name Sort------------");
		Arrays.sort(fruitsArray, new FruitNameComparator());
		for (Fruit temp : fruitsArray) {
			System.out.println(temp.getFruitName() + ":" + temp.getQuantity());
		}

		// Compare using fruitDesc
		System.out.println("--------Desc Sort------------");
		Arrays.sort(fruitsArray, new FruitDescComparator());
		for (Fruit temp : fruitsArray) {
			System.out.println(temp.getFruitName() + "		:" + temp.getFruitDesc() +":"+ temp.getQuantity());
		}

	}

}
