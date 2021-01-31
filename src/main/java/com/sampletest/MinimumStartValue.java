package com.sampletest;

import java.util.Arrays;
import java.util.List;

public class MinimumStartValue {
	
	public int getMinimumStatValue(List<Integer>a) {
		int x = 1;
		int sum = 0;
		while(x < Integer.MAX_VALUE) {
			sum = x;
			for (Integer integer : a) {
				sum+= integer;
				if(sum <1)
					break;
			}
			if(sum >=1)
				return x;
			x++;
		}
		return 0;
	}
	
	public int fintMinimumStatValue(List<Integer>a) {
		int x= 1;
		for(int i=a.size()-1;i>=0;i--) {
			x = x - a.get(i);
			if(x<1)
				x = 1;
		}
		return x;
	}
	public static void main(String[] args) {
		//Integer a[] = {-2,3,1,-5};
		Integer a[] = {-5,4,-2,3,1,-1,-6,-1,0,5};
		List<Integer> list = Arrays.asList(a);
		//Map<Character, Long> collect =  "abcsdnvs".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		// System.out.println("abcsdnvs".chars().mapToObj(i -> (char)i).collect(Collectors.toList()));
       //collect.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));
		//System.out.println("The minumum start value is " + new MinimumStartValue().getMinimumStatValue(list));
		//System.out.println("The minumum start value is " + new MinimumStartValue().fintMinimumStatValue(list));
		String x= "Geeks for Geeks";
	}

}
