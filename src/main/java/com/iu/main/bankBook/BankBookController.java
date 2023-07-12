package com.iu.main.bankBook;

import java.util.ArrayList;
import java.util.Scanner;


public class BankBookController {
	
	public void controller() throws Exception{
		boolean s = true;
		
		Scanner sc = new Scanner(System.in);
		
		BankBookDAO bankBookDAO = new BankBookDAO();
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		
		BankBookInput bankBookInput = new BankBookInput();
		
		BankBookOutput bankBookOutput = new BankBookOutput();
		
	
		while(s) {
			System.out.println("1. 생성  2.삭제  3. 1개 조회 4. 제품 전체조회 5.제품 서치 6. 프로그램 종료");
			int num = sc.nextInt();
			
			if(num==1) {
				bankBookDTO = bankBookInput.bankBookAdd();
				num = bankBookDAO.bankBookAdd(bankBookDTO);
				if(num>0) {
					bankBookOutput.view("등록 성공");
				}else {
					bankBookOutput.view("등록 실패");
				}
			}else if(num==2){
				bankBookDTO = bankBookInput.bankBookDelete();
				num = bankBookDAO.bankBookDelete(bankBookDTO);
				if(num>0) {
					bankBookOutput.view("삭제 성공");
				}else {
					bankBookOutput.view("삭제 실패");
				}
				
			}else if(num==3) {
				bankBookDTO = bankBookInput.bankBookDetail();
				bankBookDTO = bankBookDAO.bankBookDetail(bankBookDTO);
				if(bankBookDTO !=null) {
					bankBookOutput.view(bankBookDTO);
				}else {
					bankBookOutput.view("해당 상품은 존재하지 않습니다");
				}
			}else if(num==4) {
				ArrayList<BankBookDTO> ar = bankBookDAO.bankBooklist();
				bankBookOutput.view(ar);
			}else if(num==5) {
				System.out.println("조회할 이름 입력");
				String ss = sc.next();
				ArrayList<BankBookDTO> ar = bankBookDAO.bankBookSearch(ss);
				bankBookOutput.view(ar);
			}else if(num==6) {
				System.out.println("프로그램이 종료됩니다.");
				break;
				
			}
		}
				
	}

			

}
