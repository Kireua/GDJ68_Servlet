package com.iu.main.api.utill.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ListStudy {
	
	public void s1() {
		//<>Generic
		//E Element : 변수
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(2);
		int num = ar.get(0);
		
		
	}

	public void ex1() {
		Random random = new Random();
		HashSet hashSet = new HashSet();
		
//		for(int i=hashSet.size(); i>-1; i++) {
//			hashSet.add(random.nextInt(44)+1);
//			if(hashSet.size()==6) {
//				break;
//			}
//		}
		
		while(hashSet.size()!=6) {
			hashSet.add(random.nextInt(44)+1);
		}
		System.out.println(hashSet);
		System.out.println(hashSet.size());
	}
}
