package com.sortArraysAndArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortingLinkedList {

	public static void main(String a[]) {

		LinkedList<String> arrl = new LinkedList<String>();
		
		arrl.add("First");
		arrl.add("Second");
		arrl.add(0, "new");
		arrl.add("Random");
		
		System.out.println(arrl.get(0));
		
		System.out.println(arrl);
		//sorting.
		Collections.sort(arrl,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.toUpperCase().compareTo(o2.toUpperCase());
			}
			
		});
		System.out.println(arrl);
		
		//reverse order.
		arrl.descendingIterator();

	}

}
