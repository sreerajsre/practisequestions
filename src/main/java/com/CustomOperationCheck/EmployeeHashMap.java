package com.CustomOperationCheck;

import java.util.HashMap;

public class EmployeeHashMap {
	private String name;
	private int id;
	public EmployeeHashMap(String name,int id) {
		this.name  = name;
		this.id = id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeHashMap other = (EmployeeHashMap) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	public static void main (String[] args){
		HashMap<EmployeeHashMap,String> hashMap = new HashMap<EmployeeHashMap,String>();
		hashMap.put(new EmployeeHashMap("Ram", 10), "10");
		hashMap.put(new EmployeeHashMap("Ram", 10), "10");
		hashMap.put(new EmployeeHashMap("Ram", 10), "10");
		hashMap.entrySet().forEach(e-> System.out.println(e));
		
	}

@Override
public String toString() {
	return "[" + name + "," + id + "]";
}
	

}