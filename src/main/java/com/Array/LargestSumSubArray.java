package com.Array;

public class LargestSumSubArray {
	
	public int []array = {-2,-3,4,-1,-2,1,5,-3};
	public int maxSum,currentSum = 0;
	int start, end;
	
	public int largestSum() {
		for(int i = 0;i<array.length;i++) {
			currentSum+= array[i];
			if(currentSum < 0) {
				currentSum = 0;
				start = i+ 1;
			}else if(maxSum < currentSum) {
				maxSum = currentSum;
				end = i;
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		LargestSumSubArray subArray = new LargestSumSubArray();
		System.out.println("Largest sum = " + subArray.largestSum());
		System.out.println("Start : " + (subArray.start+1));
		System.out.println("End : " + (subArray.end+1));

	}

}
