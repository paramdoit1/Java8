package com.java8.feature.stream;

import java.util.Arrays;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Square of numbers
		List<Integer> numList = Arrays.asList(4, 6, 2, 5, 7);
		List<Integer> resultList = numList.stream().map(x -> x * x).collect(Collectors.toList());

		System.out.println("Square of numbers: " + resultList);

		// Filter the strings start with "S"
		List<String> wordList = Arrays.asList("House", "Door", "Window", "Bed", "Pillow", "Gate", "StairCase",
				"Pillow");
		List<String> sList = wordList.stream().filter(item -> item.startsWith("S")).collect(Collectors.toList());
		System.out.println("Word starts with S: " + sList);

		// wordcount having length >4
		long wordCount = wordList.stream().filter(item -> item.length() > 4).count();
		System.out.println("Word  count length greater than 4: " + wordCount);

		// words having length >4
		List<String> wordListGreaterthan4 = wordList.stream().filter(item -> item.length() > 4)
				.collect(Collectors.toList());
		System.out.println("Word  count length greater than 4: " + wordListGreaterthan4);

		// words having length sorted
		List<String> wordListGreaterthan4Sorted = wordList.stream().filter(item -> item.length() > 4).sorted()
				.collect(Collectors.toList());
		System.out.println("Word  count length greater than 4 Sorted: " + wordListGreaterthan4Sorted);

		// words having length sorted Set
		Set<String> wordListGreaterthan4SortedSet = wordList.stream().filter(item -> item.length() > 4).sorted()
				.collect(Collectors.toSet());
		System.out.println("Word  count length greater than 4 Sorted Set: " + wordListGreaterthan4SortedSet);
		
		System.out.println("Set print using foreach");
		wordListGreaterthan4SortedSet.stream().map(item -> item.toUpperCase()).sorted().forEach(item -> System.out.println(item));
		
		System.out.println("Reduce method");

		  int result = numList.stream().filter(x->x%2==0).reduce(0, (acc,x)-> acc+x);
		  
		  System.out.println(result);
		  
		 // .collect(Collectors.toList());				  //.reduce(0,(ans,i)-> ans+i);	  
			//    System.out.println(numbersList);
	}

}
