package com.sampletest;
	
public class FindRepeat{
	public static int x = 10;
	private int y = 20;
	public int z = 30;
	
	static class NestedClass{
		public void print() {
			System.out.println(x);
			//System.out.println(y);
			//System.out.println(z);
		}
	}
	class Inner{
		public void innerPrint() {
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
	}
	
	public static void main(String[] args) {
		FindRepeat.NestedClass nested = new FindRepeat.NestedClass();
		nested.print();
		FindRepeat.Inner inner = new FindRepeat().new Inner();
		inner.innerPrint();
	}
	
}
