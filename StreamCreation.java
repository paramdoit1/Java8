package com.java8.feature.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.*;

public class StreamCreation {

	public static void main(String[] args) {
		Stream<String> firstStream = Stream.empty();
		
		//Creation of Stream from Collection
		Collection list = Arrays.asList("house", "piller", "steps");
		firstStream = (list == null || list.isEmpty()) ? firstStream :list.stream();
		
		firstStream.forEach(System.out::println);
		
		//Creation of stream from array source
		System.out.println("stream from array source");
		Stream<String> arrayStream = Stream.of("white", "blue", "green");
		arrayStream.forEach(System.out::println);
		
		System.out.println("stream from existing array");
		String[] array1 = new String[] {"Rabbit", "cow", "hen", "dog", "cat"};
		Stream<String> arrayStreamFull = Arrays.stream(array1);
		System.out.println("stream from existing array full");
		arrayStreamFull.forEach(System.out::println);

		System.out.println("stream from existing array part");
		Stream<String> arrayStreamPart = Arrays.stream(array1, 1,3);
		arrayStreamPart.forEach(System.out::println);





	}

}
