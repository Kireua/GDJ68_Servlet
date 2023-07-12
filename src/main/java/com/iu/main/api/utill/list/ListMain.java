package com.iu.main.api.utill.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ListMain {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		//autoboxing
		ar.add(1);
		ar.add(3.2);
		ar.add("test");
//		ar.add(1, "add");
//		ar.set(0, "first");
//		ar.remove(0);
//		ar.remove("test");
////		ar.clear();
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		int num = (Integer)ar.get(0); //다형성, 오토언박싱
		
//		LinkedList ar2 = new LinkedList();
//		ar2.add(1);
//		ar2.remove(0);
//
		
//		HashSet hashSet = new HashSet();
//		hashSet.add(1);
//		hashSet.add(2);
//		hashSet.add("f1");
//		hashSet.add(2);
//		hashSet.size();
//		System.out.println(hashSet);//원래 toString으로 인해 참조변수는 주소를 찍지만 hashSet은 toString()를 overriding 해서 값을 찍게 만들었음
//		System.out.println(hashSet.size());
//		
//		ListStudy listStudy = new ListStudy();
//		listStudy.ex1();
	}
	
}
