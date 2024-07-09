package com.CustomOperationCheck;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNumber {

    // Custom comparator to sort the numbers
    private static class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1); // Descending order
        }
    }

    public static String formBiggestNumber(int[] nums) {
        // Convert the integers to strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort the string numbers based on the custom comparator
        Arrays.sort(strNums, new CustomComparator());

        // If the largest number is "0", the result should be "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Build the final largest number
        StringBuilder largestNumber = new StringBuilder();
        for (String num : strNums) {
            largestNumber.append(num);
        }

        return largestNumber.toString();
    }

    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println("The biggest number is: " + formBiggestNumber(nums));
    }
}
