package com.iu.main;

import com.iu.main.bankBook.BankBookDAO;
import com.iu.main.utill.DbConnector;

public class StartMain {

	public static void main(String[] args) {
		try {
		System.out.println("Start Main");

		//최초 실행과 만드는 애들 test
		BankBookDAO bankBookDAO = new BankBookDAO();
		//참조변수명. 멤버들
		bankBookDAO.bankBookAdd();
		
		DbConnector dbConnector = new DbConnector();
		dbConnector.getConnection();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
