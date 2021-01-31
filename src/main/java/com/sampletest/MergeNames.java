package com.sampletest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class MergeNames {
	
	List<Integer> list = new LinkedList<Integer>();
	Queue<Integer> q = new LinkedList<Integer>();
	Stack<String> s = new Stack<>();
    public static String[] uniqueNames(String[] names1, String[] names2) {
        int l1 = 0;
        int l2 = 0 ;
        List<String> names = new ArrayList<String>();
        if(names1.length >names2.length ){
        	l1 = names1.length;
        	l2 = names2.length;
        }else {
        	l1 = names2.length;
        	l2 = names1.length;
        }
        String[] con = new String[l1];
        for(int i=0;i<names1.length;i++){
        	if(!names.contains(names1[i]))
        		names.add(names1[i]);
        		
        }
        for(int i=0;i<names2.length;i++){
        	if(!names.contains(names2[i]))
        		names.add(names2[i]);
        		
        }   
        return names.toArray(con);
        
    }
    
    public static void main(String args []) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
