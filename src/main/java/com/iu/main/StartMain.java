package com.iu.main;

import java.util.ArrayList;

import com.iu.main.bankBook.BankBookController;
import com.iu.main.bankBook.BankBookDAO;
import com.iu.main.bankBook.BankBookDTO;
import com.iu.main.bankBook.BankBookInput;
import com.iu.main.bankBook.BankBookOutput;
import com.iu.main.utill.DbConnector;

public class StartMain {

	public static void main(String[] args) {
		try {
			System.out.println("Start Main");
	
			//최초 실행과 만드는 애들 test
			
			BankBookController bankBookController = new BankBookController();
			
			bankBookController.controller();
//			
//			BankBookOutput bankBookOutput = new BankBookOutput();
//			
//			BankBookDAO bankBookDAO = new BankBookDAO();
//			ArrayList<BankBookDTO> ar = bankBookDAO.bankBookSearch("주");
//			bankBookOutput.view(ar);
			
			
//			System.out.println(bankBookDTO.getBookName()+","+bankBookDTO.getBookNum()+","+bankBookDTO.getBookRate()+","+bankBookDTO.getBookSale());
//			bankBookDTO = bankBookInput.bankBookAdd();
//		
//			//참조변수명. 멤버들
//			int result = bankBookDAO.bankBookAdd(bankBookDTO);
//			if(result>0) {
//				System.out.println("Insert 성공");
//			}else {
//				System.out.println("Insert 실패");
//			}
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
