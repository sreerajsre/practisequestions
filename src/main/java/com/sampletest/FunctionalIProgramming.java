package com.sampletest;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalIProgramming {
	
	public static void main(String[] args) {
		Predicate<Integer> p = (a)-> a>10;
		Function<Integer,Integer> t = (a)->a + 8;
		System.out.println(t.apply(10));
	}
}
