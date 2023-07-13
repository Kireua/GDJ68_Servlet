package com.iu.main.api.utill.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("k1", 20);
		map.put("k2", 50);
		map.put("k3", 45);
		
		map.remove("k1",25);
//		map.clear();
		String ss =map.toString();
		System.out.println("string "+ss);
		map.put("k3", 60);
		
		System.out.println(map.get("k2"));
		System.out.println(map.containsKey("k3"));
		System.out.println(map.containsValue(50));
		System.out.println(map);
		System.out.println("====================set=================");
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		//메소드에서 생성된건 Iterator 로 구현한 타입일거기때문에 뭐든간에 Iterator로 받으면됨
		Iterator<Integer> it = set.iterator();
		
		//HashSet 있는 데이터들 꺼내기 몇개있는지 모르니 와일
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}
		
		System.out.println("================map==================");
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println("KEY : "+key);
			int value = map.get(key);
			System.out.println("Value : "+value);
		}
	}

}
