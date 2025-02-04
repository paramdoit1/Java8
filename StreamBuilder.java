package com.java8.feature.stream;

import java.util.stream.*;

public class StreamBuilder {

	public static void main(String[] args) {
		Stream<Object> stream = Stream.empty();
		stream =  Stream.builder().add("hello").add("my").add("world").build();
		stream.forEach(System.out::println);
	}

}
