package com.iu.main.api.exception;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("프로그램 시작");
		
		ExceptionStudy study = new ExceptionStudy();
//		study.s1();
		
		try {
			study.s3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("프로그램 종료");
	}

}
