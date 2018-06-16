package com.sortArraysAndArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapOrTablePrimitiveTypes {

	public static void main(String a[]) {

		//Hashtable<String, String> hm = new Hashtable<String, String>();
		
		Map<String, String> hm = new HashMap<String, String>();
		
		
		hm.put("second", "SECOND INSERTED");
		hm.put("first", "FIRST INSERTED");
		hm.put("third", "THIRD INSERTED");
		
		System.out.println(hm);
		
		//Sort Hashtable with use of Treemap
		TreeMap<String,String> treeMap = new TreeMap<String,String>(hm);
		System.out.println("Approach1 using tree Map = " + treeMap); 
		
			//Sort Hashtable : 1.Get the keySet  2.Convert into List  3.Sort the list  4. Get the hashtable values in sorted order.
		   //5.insert into LinkedHashMap as this will maintain the insertion order.
		   List<String> keys = new LinkedList<String>(hm.keySet());
		   Collections.sort(keys);
		   
		   Map<String,String> sortedMap = new LinkedHashMap<String,String>();
		      
		   Iterator<String> itr1 = keys.iterator(); 
		   while (itr1.hasNext()) { 
		         String key = (String)itr1.next(); 
		         String value = treeMap.get(key).toString(); 
		         sortedMap.put(key, value); 
		   }  
		   System.out.println("Approach2 using sort the keys insert into LinkedHashMap = "+sortedMap);
	}
}
