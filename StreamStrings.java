package com.java8.feature.stream;

import java.util.Arrays;

import java.util.List;
import java.util.stream.*;

public class StreamStrings {

	public static void main(String[] args) {
		String[] str = {"hello", "world"};
		List<String> ls = Arrays.asList(str);
		
		ls.stream().map(data -> data.toUpperCase()).forEach(data -> System.out.println(data));
		
		List<Integer> list = Stream.iterate(1, i->i+1).limit(10).collect(Collectors.toList());
		list.forEach(System.out::println);
	}
}
