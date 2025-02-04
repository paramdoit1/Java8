package com.java8.feature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


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


public class StreamFilter {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();

		Product p1 = new Product(21, "book", 10);
		Product p2 = new Product(12, "pen", 20);
		Product p3 = new Product(36, "pencil", 30);
		Product p4 = new Product(46, "Eraser", 25);
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		
		Stream<Product> filteredProduct = productList.stream().filter(p -> p.price>21); 
		
		filteredProduct.forEach(product -> System.out.println(product.name+ " "+product.price));

	}

}
