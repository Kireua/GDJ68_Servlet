package com.iu.main.api.lang.string;

import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		String name ="winter";
//		String name2="Karina";
//		
//		//멤버메서드 호출 문법
//		//참조변수명.메서드명()
//		String result = name.concat(name2);
//		System.out.println(result);
//		
//		name2 = "winter";
//		
//		System.out.println(name.toString());
//		System.out.println(name2.toString());
//		
//		System.out.println(name==name2);
//		System.out.println("이름 입력");
//		String name3 = sc.next();
//		System.out.println(name==name3);
//		
//		System.out.println(name.equals(name3));
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("파일명 입력");
		String ff = sc.next();
		System.out.println(ff);
		String ff1 = sc1.next();
		System.out.println(ff1);
		StringStudy stringStudy = new StringStudy();
//		stringStudy.s1();
//		stringStudy.s2();
//		stringStudy.s3();
		stringStudy.ex2();

	}

}
