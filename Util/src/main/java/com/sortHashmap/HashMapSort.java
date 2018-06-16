package com.sortHashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class HashMapSort {

	/*sort hashmap with key as String*/
	public static void main(String[] args) {
		 Map<String,Double> map = new HashMap<String,Double>();
	        TreeMap<String,Double> sorted_map = new TreeMap<String,Double>();

	        map.put("B",67.5);
	        map.put("C",67.4);
	       
	        map.put("A",99.5);
	        map.put("D",67.3);

	        System.out.println("results: "+map);
	        sorted_map.putAll(map);

	        System.out.println("results: "+sorted_map);
	    }

	
}
