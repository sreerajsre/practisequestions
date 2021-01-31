package com.sampletest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

class A{
	A(){
		System.out.println("from A");
	}
	A a = new A();
	public void method1() {
		System.out.println("Class A Method1");
	}
}

class B extends A{
	
	B(int x){
		System.out.println("from B " + x);
	}
	public void method2() {
		System.out.println("Class B Method2");
	}
	public void method3() {
		System.out.println("Class B Method3");
	}
}

class C extends B{
	
	C(int x){
		super(x);
		System.out.println("from C " + x);
	}
	
	public void method3() {
		super.method3();
		System.out.println("Class C Method3");
	}
	

}

public class TestClass {

	public static void main(String[] args) {
		C c   = new C(10);
		A a = new A();
		//c.method1();
		//c.method2();
		//c.method3();
		HashMap<String,String> hashMap = new HashMap<String,String>();
		hashMap.put("Ram", "10");
		hashMap.put("Ram", "10");
		hashMap.put("Ram", "20");
		hashMap.put("Shyam", "10");
		Set<Entry<String, String>> x1 = hashMap.entrySet();
		//x1.forEach(e-> System.out.println(e));
		List<Integer> list = new ArrayList<Integer>();
		list.stream().findFirst();
		
		
	}

}
