package com.methodreference;

import java.util.Arrays;

public class IntPredicatesChecker {
    // A static method for checking if  a number is positive
    public static boolean isPositive(int n) {
        return n > 0;
    }
    // A static method for checking if a number is even
    public static boolean isEven(int n) {
    	String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
    	/* Method reference to an instance method of an arbitrary 
    	 * object of a particular type
    	 */
    	String s = "abc";
    	Arrays.sort(stringArray, String::compareToIgnoreCase);
    	for(String str: stringArray){
    		System.out.println(str);
    	}
        return (n % 2) == 0;
    }
    
    
}
