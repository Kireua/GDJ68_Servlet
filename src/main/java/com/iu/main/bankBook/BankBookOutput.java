package com.iu.main.bankBook;

import java.util.ArrayList;

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

	public void view(ArrayList<BankBookDTO> ar) {
		for(int i=0; i<ar.size(); i++) {
			this.view(ar.get(i));
		}
		
	}
}
