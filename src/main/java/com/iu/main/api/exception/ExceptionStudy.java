package com.iu.main.api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionStudy {
	
	public void s3() throws Exception {
		//유치원 입학전 3~4
		int num1=20;
		int num2=12;
		
		int result = num1+num2;
		if(result>100) {
			throw new MyException("세자리가 되어버렸어"); //트라이캐치안해서 여기서 예외 발생되면 종료됨
		}
		
		result= num2-num1;
		if(result<0) {
			throw new MyException("그런거 몰라요");
		}
	}
	
	public void s2() throws Exception {
		int num = 30;
		int num2 =0;
		System.out.println(num/num2);
		
		
		
	}
	
	//try catch
	public void s1() {
		Scanner sc = new Scanner(System.in);
		int num=26;
		int result=0;
		System.out.println("숫자를 입력");
		try {
		int num2 = sc.nextInt();
//		 throw new InputMismatchException(); JVM이 만들어서 던짐 정수값이 아닌걸 넣었을때의 오류
		result = num/num2;
//		 throw new ArithmeticException(); 0 으로 나누려고할때의 오류
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Result : "+result);
	}

}
