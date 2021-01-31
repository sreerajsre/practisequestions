package com.Array;

public class AnagramApp {

	static int size;
	static int count = 0;
	static  String word;
	static char [] arr = new char[100];
	public static void main(String[] args) {
		word = "cat";
		size = word.length();
		arr = word.toCharArray();
		doAnagram(size);
	}
	private static void doAnagram(int newsize) {
		if(newsize == 1)
			return;
		for(int j=0;j<newsize;j++) {
			doAnagram(newsize -1);
			if(newsize == 2)
				display();
			rotate(newsize);
		}
	}
	private static void rotate(int newsize) {
		int p = size - newsize;
		int j;
		char temp = arr[p];
		for(j=p+1;j<size;j++)
			arr[j-1]= arr[j];
		arr[j-1] = temp;
	}
	private static void display() {
		if(count < 99)
			System.out.print(" ");
		if(count < 9)
			System.out.print(" ");
		System.out.print(++count + " ");
		for(int j=0;j<size;j++)
			System.out.print(arr[j]);
		System.out.print(" ");
		if(count %6 == 0)
			System.out.print(" ");

	}
}
