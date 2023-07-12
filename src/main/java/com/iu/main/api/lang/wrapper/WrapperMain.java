package com.iu.main.api.lang.wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Integer.SIZE);
//		System.out.println(Integer.BYTES);
//
//		int num=10;
//		Integer num2= new Integer(num);
//		num =num2.intValue();
//		System.out.println(num);
//		System.out.println(num2);
//		
//		num2 = new Integer("32");
//		num=num2.intValue();
//		
//		//AutoBoxing 원래 생성자로 감싸야하는데 자동으로 감싸게 해줌
//		num2=num;//원래는 불가능함 num2는 레퍼런스고 num은 스택에 생기는 데이터를 담는 변수이므로
//		//AutoUnBoxing
//		num=num2; // 반대도 가능
//		
//		Long l1 = 10L;
//		l1 =  (long)num;
//		long l2 = num;
//		
//		String n = "20";
//		num = Integer.valueOf(n);
//		int s = Integer.parseInt(n);
//		System.out.println(s);
//		System.out.println(num*3);
		
		WrapperStudy wrapperStudy = new WrapperStudy();
		wrapperStudy.ex2();
		
	}

}
