package com.Array;


class Reduce{
	static int i;
	static Reduce r;
	public static void gfg(String s) {
		System.out.println("String");
	}
	public static void gfg(Object o) {
		System.out.println("Obh");
	}
	public static void main(String [] ars) throws InterruptedException {
		Reduce r1 = new Reduce();
//		r1 =null;
//		System.gc();
//		Thread.sleep(1000);
//		r =null;
//		System.gc();
//		Thread.sleep(1000);
//		System.out.println("finalise" + i);
		gfg(null);
		
	}
	@Override
	protected void finalize() {
		i++;
		r =this;
	}
}
	
