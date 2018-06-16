package com.sortArraysAndArrayList;


import java.util.Comparator;


public class LastNameCompartor implements Comparator<Key>{
	
	@Override
	 public int compare(Key k1, Key k2) {

         return k1.getLname().compareTo(k2.getLname());
	}

}
