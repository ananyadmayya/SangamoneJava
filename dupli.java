package com.sangamone.java;

import java.util.ArrayList;
import java.util.List;

public class dupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		list1.add(3);
		list1.add(2);
		list1.add(3);
		list1.add(2);
		list1.add(4);
		list1.add(5);
		
		list2.addAll(list1);
		
		for(int i=0;i<list1.size();i++) {
			for(int j=i+1;j<list2.size();j++) {
				if(list2.get(i)==list2.get(j)) {
					list2.remove(j);
					
					
				}
				
			}
			}
				
		System.out.println(list2);
		System.out.println("hello");
	}

}