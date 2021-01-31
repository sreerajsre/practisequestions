package com.CustomOperationCheck;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeTreeSet {
	private String name;
	private int id;
	private int age;
	public EmployeeTreeSet(String name,int id,int age) {
		this.age = age;
		this.name  = name;
		this.id = id;
	}


	public static void main (String[] args){
		Comparator<EmployeeTreeSet> cmp = new Comparator<EmployeeTreeSet>() {

			@Override
			public int compare(EmployeeTreeSet o1, EmployeeTreeSet o2) {
				if(o1.id == o2.id)
					return 0;
				else if(o1.id < o2.id)
					return -1;
				return 1;
			}
		};
		TreeSet<EmployeeTreeSet> treeSet = new TreeSet<EmployeeTreeSet>(cmp);
		treeSet.add(new EmployeeTreeSet("Ram",10,30));
		treeSet.add(new EmployeeTreeSet("Shyam",55,30));
		treeSet.add(new EmployeeTreeSet("Manu",32,30));
		
		treeSet.stream().forEach(e-> System.out.println(e.name + " " + e.id));
	}

}