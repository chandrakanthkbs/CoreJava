package com.sortArraysAndArrayList;
import java.util.Hashtable;

public class OverrideEqualsAndHashCode {
	
	public static void main(String args[])
	{
		
		Fruit pineappale = new Fruit("Pineapple", "ine description",70);
		Fruit pineappale1 = new Fruit("Pineapple", "ine description",70); 
		
		if(pineappale.equals(pineappale1) && pineappale.hashCode() == pineappale1.hashCode())
			System.out.println("Equals");
		else
			System.out.println("Not Equals");

		Key key = new Key("chandra", "kanth");
		Key key1 = new Key("chandra", "kanth");
		
		Hashtable<Key, Fruit> map = new Hashtable<Key, Fruit>();
		map.put(key, pineappale);
		
		System.out.println(map.get(key1).toString());
		
		}

}
