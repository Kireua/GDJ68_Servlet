package com.iu.main.bankBook;

public class BankBookOutput {
	
	public void view(BankBookDTO bankBookDTO) {
		System.out.println(bankBookDTO.getBookNum());
		System.out.println(bankBookDTO.getBookName());
		System.out.println(bankBookDTO.getBookRate());
		System.out.println(bankBookDTO.getBookSale());
	}
	
	public void view(String str) {
		System.out.println("=========="+str+"==========");
	}

}