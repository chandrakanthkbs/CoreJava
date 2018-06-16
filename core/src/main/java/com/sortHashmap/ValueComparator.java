package com.sortHashmap;

import java.util.Comparator;
import java.util.Map;


public class ValueComparator implements Comparator<Double> {

	    Map<String, Double> obj;
	    public ValueComparator(Map<String, Double> obj) {
	        this.obj = obj;
	    }

	    // Note: this comparator imposes orderings that are inconsistent with equals.    
	    public int compare(Double a, Double b) {
	        if (obj.get(a) >= obj.get(b)) {
	            return -1;
	        } else {
	            return 1;
	        } // returning 0 would merge keys
	    }
	}

