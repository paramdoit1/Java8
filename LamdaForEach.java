package com.java8.feature.lamda;

import java.util.ArrayList;
import java.util.List;

public class LamdaForEach {

	public static void main(String[] args) {
		List<String> fruitList = new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Orange");
		fruitList.add("Mango");
		fruitList.add("Banana");
		System.out.println("Method References");
		fruitList.forEach(System.out::println);
		
		System.out.println("Lamda Experession");
		fruitList.forEach(fruit -> System.out.println(fruit));
	}

}
