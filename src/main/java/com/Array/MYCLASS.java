package com.Array;

class MYCLASS {
 public MYCLASS x;
  public static void main(String [] args) {
   	MYCLASS x2 = new MYCLASS();
   	MYCLASS x3 = new MYCLASS();
   	x2.x = x3;
   	x3.x = x2;
   	x2 = new MYCLASS();
  	x3 = x2;
  	System.gc();
   	//doComplexStuff
  }
  @Override
  public void finalize() {
	  System.out.println(this  + "collected");
  }
 }