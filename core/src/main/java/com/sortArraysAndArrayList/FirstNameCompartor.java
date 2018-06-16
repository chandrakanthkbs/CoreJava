package com.sortArraysAndArrayList;

import java.util.Comparator;

public class FirstNameCompartor implements Comparator<Key>{

	 public int compare(Key k1, Key k2) {

         return k2.getFname().compareTo(k1.getFname());
	}

}
