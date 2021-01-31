package com.sampletest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Duck implements Comparable<Duck>{

	private String name;
	private int wt;
	
	public Duck(String name,int wt) {
		this.name = name;
		this.wt = wt;
	}
	@Override
	public int compareTo(Duck d) {
		// TODO Auto-generated method stub
		System.out.println("name : " + name + "," +  "d.name : " + d.name);
		System.out.println(name.compareTo(d.name));
		return name.compareTo(d.name);
	}
	
	public String toString() {
		return name;
	}
	
	public static void main(String args[]) {
		List<Duck> ducks = new ArrayList<>();
		Comparator<Duck> byWeight = new Comparator<Duck>() {

			@Override
			public int compare(Duck d1, Duck d2) {
				System.out.println("d1.name : " + d1.name + "," +  "d2.name : " + d2.name);
				System.out.println(d1.wt - d2.wt);
				return d1.wt - d2.wt;
			}
			
		};
		ducks.add(new Duck("Quack",10));
		ducks.add(new Duck("Paddle",7));
		ducks.add(new Duck("Meow",15));
		Collections.sort(ducks);
		//Collections.sort(ducks,byWeight);
		System.out.println(ducks);
	}
}
