package com.java8.feature.lamda;

public class LambdaTest {
	
	//Functional Interface with one method
	interface MathOperation {
		int operation(int a, int b);
	}

	//Lambda which provides the implementation for Functional Interface.
	public static void main(String[] args) {
		MathOperation operate = (int a, int b) -> {
			System.out.println("hello functional interaface");
			return a+b;
		};
		System.out.println(operate.operation(5,6));
	}

}
