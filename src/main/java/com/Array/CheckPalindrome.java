package com.Array;

public class CheckPalindrome {
	public int countPalindromes(String s) {
		int length = s.length();
		int count = 0;
		for(int i=0;i<length;i++) {
			for(int j=0;j< length-i;j++) {
				String subString= s.substring(j, i+j+1);
				if(isPalindrome(subString)) {
					count++;
				}
			}
		}
		return count;
	}

	private boolean isPalindrome(String string) {
		if(string.length() == 0 || string.length() == 1)
			return true;
		if(string.charAt(0) == string.charAt(string.length() -1))
			return isPalindrome(string.substring(1, string.length() - 1));
		return false;
	}

	public static void main(String[] args) {
		CheckPalindrome chk = new CheckPalindrome();
		chk.countPalindromes("aaa");
	}

}
