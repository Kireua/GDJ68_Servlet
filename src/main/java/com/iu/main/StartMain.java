package com.iu.main;

import com.iu.main.bankBook.BankBookDAO;

public class StartMain {

	public static void main(String[] args) {
		System.out.println("Start Main");

		//최초 실행과 만드는 애들 test
		BankBookDAO bankBookDAO = new BankBookDAO();
		//참조변수명. 멤버들
		bankBookDAO.bankBookAdd();
	}

}
