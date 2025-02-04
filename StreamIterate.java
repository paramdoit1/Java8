package com.java8.feature.stream;

import java.util.List;
import java.util.stream.*;

public class StreamIterate {

	public static void main(String[] args) {
		//Given
		Stream<Integer> stream = Stream.iterate(0, i-> i+2);
		
		//When
		List<Integer> collect = stream.limit(11).collect(Collectors.toList());
		
		//Then
		collect.forEach(System.out::println);
		
	}

}
