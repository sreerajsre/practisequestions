package com.CustomOperationCheck;

import java.util.Comparator;
import java.util.TreeMap;

public class EmployeeTreeMap {
	private String name;
	private int id;
	public EmployeeTreeMap(String name,int id) {
		this.name  = name;
		this.id = id;
	}


	public static void main (String[] args){
		Comparator<EmployeeTreeMap> cmp = new Comparator<EmployeeTreeMap>() {

			@Override
			public int compare(EmployeeTreeMap o1, EmployeeTreeMap o2) {
				if(o1.id == o2.id)
					return 0;
				else if(o1.id < o2.id)
					return -1;
				return 1;
			}
		};
		TreeMap<EmployeeTreeMap,String> treeMap = new TreeMap<EmployeeTreeMap,String>(cmp);
		treeMap.put(new EmployeeTreeMap("Ram", 10), "10");
		treeMap.put(new EmployeeTreeMap("Ram", 10), "30");
		treeMap.put(new EmployeeTreeMap("Ram", 10), "15");
		treeMap.entrySet().forEach(e-> System.out.println(e));
		
	}

@Override
public String toString() {
	return "[" + name + "," + id + "]";
}
	

}