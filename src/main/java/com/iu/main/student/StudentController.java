package com.iu.main.student;

import java.util.Scanner;

public class StudentController {

	public void controller()throws Exception {
		boolean s = true;
		
		Scanner sc = new Scanner(System.in);
		StudentDAO studentDAO = new StudentDAO();
		StudentDTO studentDTO = new StudentDTO();
		StudentInput studentInput = new StudentInput();
		StudentOutput studentOutput = new StudentOutput();
		
		while(s) {
			System.out.println("1. 생성  2.삭제  3. 조회 4. 프로그램 종료");
			int num = sc.nextInt();
			
			if(num==1) {
				studentDTO = studentInput.studentAdd();
				num = studentDAO.studentAdd(studentDTO);
				if(num>0) {
					studentOutput.view("등록 성공");
				}else {
					studentOutput.view("등록 실패");
				}
			}else if(num==2){
				studentDTO = studentInput.studentDelete();
				num = studentDAO.studentDelete(studentDTO);
				if(num>0) {
					studentOutput.view("삭제 성공");
				}else {
					studentOutput.view("삭제 실패");
				}
				
			}else if(num==3) {
				studentDTO = studentInput.studentDetail();
				studentDTO =studentDAO.studentDetail(studentDTO);
				if(studentDTO !=null) {
					studentOutput.view(studentDTO);
				}else {
					studentOutput.view("해당 학생은 존재하지 않습니다");
				}
			}else if(num==4) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
		}
	}
}
