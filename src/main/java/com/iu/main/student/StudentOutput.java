package com.iu.main.student;

import com.iu.main.bankBook.BankBookDTO;

public class StudentOutput {

	public void view(StudentDTO studentDTO) {
		System.out.println(studentDTO.getStudNum());
		System.out.println(studentDTO.getName());
		System.out.println(studentDTO.getKorean());
		System.out.println(studentDTO.getEnglish());
		System.out.println(studentDTO.getMath());
		System.out.println(studentDTO.getTotal());
		System.out.println(studentDTO.getAvg());
	}
	
	public void view(String str) {
		System.out.println("=========="+str+"==========");
	}
}
