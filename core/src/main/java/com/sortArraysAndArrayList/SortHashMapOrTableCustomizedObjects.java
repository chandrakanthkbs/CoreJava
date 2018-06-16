package com.sortArraysAndArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class SortHashMapOrTableCustomizedObjects {
	public  static void main(String args[]) {
		
		Fruit banana2 = new Fruit("Banana", "nap description",90);
		Fruit apple = new Fruit("Apple", "led description",100); 
		Fruit banana1 = new Fruit("Banana", "nap description",90);
		
		Key key1 = new Key("chandra1", "kanth1");
		Key key2 = new Key("chandra2", "kanth2");
		Key key3 = new Key("chandra3", "kanth3");
		
		// TODO Auto-generated method stub
		Map<Key, Fruit> hm = new HashMap<Key, Fruit>();
	    
	    hm.put(key1, banana1);
	    hm.put(key2, apple);
	    hm.put(key3, banana2);

	    //sorting with keys in first name order 
        sortByKeys(hm, new FirstNameCompartor());
        
	    //sorting with keys in lastname name order
        sortByKeys(hm, new LastNameCompartor());
        
        //sorting with values in first name order
        sortByValues(hm);

	}
	
	public static Map<Key,Fruit> sortByKeys(Map<Key,Fruit> map, Comparator<Key> comparator){
        List<Key> keys = new LinkedList<Key>(map.keySet());
        Collections.sort(keys, comparator);
      
        //LinkedHashMap will keep the keys in the order they are inserted
        //which is currently sorted on natural ordering
        Map<Key,Fruit> sortedMap = new LinkedHashMap<Key,Fruit>();
        for(Key key: keys){
            sortedMap.put(key, map.get(key));
            System.out.println(key +"= "+map.get(key));
        }
      
        return sortedMap;
    }
	
	public static Map<Key,Fruit> sortByValues(Map<Key,Fruit> map){
        List<Entry<Key,Fruit>> entries = new LinkedList<Entry<Key,Fruit>>(map.entrySet());
      
        Collections.sort(entries, new Comparator<Entry<Key,Fruit>>() {

            public int compare(Entry<Key,Fruit> o1, Entry<Key,Fruit> o2) {
                return ((Fruit)o1.getValue()).getFruitName().compareTo(((Fruit)o2.getValue()).getFruitName());
            }
        });
      //LinkedHashMap will keep the keys in the order they are inserted
        //which is currently sorted on natural ordering
        Map<Key,Fruit> sortedMap = new LinkedHashMap<Key,Fruit>();
      
        for(Entry<Key,Fruit> entry: entries){
            sortedMap.put(entry.getKey(), entry.getValue());
            System.out.println(entry.getKey() +"= "+entry.getValue());
        }
      
        return sortedMap;

	}

}
