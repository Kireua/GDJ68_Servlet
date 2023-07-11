package com.iu.main.student;

import java.util.Scanner;

import com.iu.main.bankBook.BankBookDTO;

public class StudentInput {

	private Scanner sc;

	public StudentInput() {
		this.sc = new Scanner(System.in);
	}
	
	public StudentDTO studentAdd() {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("학생 이름을 입력하세요");
		studentDTO.setName(sc.next());		
		System.out.println("국어 성적을 입력하세요");
		studentDTO.setKorean(sc.nextInt());
		System.out.println("영어 성적을 입력하세요");
		studentDTO.setEnglish(sc.nextInt());
		System.out.println("수학 성적을 입력하세요");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getEnglish()+studentDTO.getKorean()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3);

		
		return studentDTO;
	}
	
	public StudentDTO studentDelete() {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("삭제할 번호를 입력하세요");
		
		studentDTO.setStudNum(sc.nextLong());
		
		return studentDTO;
	}
	
	public StudentDTO studentDetail() {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("조회할 번호를 입력하세요");
		
		studentDTO.setStudNum(sc.nextLong());
		
		return studentDTO;
	}
	
	
}