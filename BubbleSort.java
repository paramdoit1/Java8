package com.java8.feature.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.function.BiConsumer;

import com.sun.java_cup.internal.runtime.Symbol;

public class BubbleSort {

	public static int[] bubbleSort(int[] array) {
		BiConsumer<int[], Integer> swapValueIf = (a, j) -> {
			if (a[j] > a[j + 1]) {
				int temp = a[j];
				array[j] = a[j + 1];
				array[j + 1] = temp;
			}
		};

		IntStream.range(0, array.length - 1)
				.forEach(i -> IntStream.range(0, array.length - 1)
						.forEach(j -> swapValueIf.accept(array, j)));

		return array;
	}

	public static void main(String[] args) {

		Integer[] numarr = { 23, 4, 12, 86, 43, 3 };
		List<Integer> list = Arrays.asList(numarr);
		List<Integer> finalList = new ArrayList<Integer>();
		
		
		int len = numarr.length;
		int[] array = { 23, 4, 12, 86, 43, 3 };

		int[] array1 = bubbleSort(array);
		for(int item: array1) {
			System.out.println(item);
		}

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (numarr[j] > numarr[j + 1]) {
					int temp = numarr[j];
					numarr[j] = numarr[j + 1];
					numarr[j + 1] = temp;
				}
			}
		}
		List<Integer> list2 = Arrays.asList(numarr);

		// System.out.println(list1);

	}

}
