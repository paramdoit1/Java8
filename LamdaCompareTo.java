package com.java8.feature.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Product {
	int id;
	String name;
	int price;
	
	Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LamdaCompareTo {
	

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		Comparator<Product> cr = (prod_1, prod_2) -> (int)(prod_1.id - prod_2.id);
		Comparator<Product> cr1 = (prod_1, prod_2) ->  prod_1.name.compareTo(prod_2.name);

		Product p1 = new Product(21, "book", 10);
		Product p2 = new Product(12, "pen", 20);
		Product p3 = new Product(36, "pencil", 30);
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		
		Collections.sort(productList, (prod1, prod2) -> Integer.valueOf(prod1.id).compareTo(Integer.valueOf(prod2.id)));
		productList.forEach(product -> System.out.println(product.id+ " "+product.name+ " "+product.price));
		
		System.out.println("--- Reverse Order Of id --- ");
		productList.sort(Collections.reverseOrder(cr));
		productList.forEach(product -> System.out.println(product.id+ " "+product.name+ " "+product.price));
		
		System.out.println("--- Correct Order --- ");
		productList.sort(cr1);
		productList.forEach(product -> System.out.println(product.id+ " "+product.name+ " "+product.price));
		
		
		
	}

}
