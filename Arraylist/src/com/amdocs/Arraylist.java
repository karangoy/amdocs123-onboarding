package com.amdocs;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {

ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(100);
numbers.add(20);
numbers.add(30);
numbers.add(40);

System.out.println("Size of array"+ numbers.size());

System.out.println("list of elements");
for(int element: numbers){
	System.out.println(element);
}
System.out.println("ARRAY LIST AFTER SORTING");
numbers.sort(null);
for(int element: numbers){
	System.out.println(element);
}
	}

}
