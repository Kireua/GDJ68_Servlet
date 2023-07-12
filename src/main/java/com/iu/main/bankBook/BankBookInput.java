package com.iu.main.bankBook;

import java.util.Scanner;

public class BankBookInput {
	
	private Scanner sc;
	
	public BankBookInput() {
		this.sc = new Scanner(System.in);
	}
	
	public BankBookDTO bankBookAdd() {
		BankBookDTO bankBookDTO = new BankBookDTO();
		System.out.println("상품명을 입력하세요");
		bankBookDTO.setBookName(sc.next());		
		System.out.println("이자율을 입력하세요");
		bankBookDTO.setBookRate(sc.nextDouble());
		System.out.println("판매여부를 입력하세요");
		bankBookDTO.setBookSale(sc.nextInt());
		
		return bankBookDTO;
	}
	
	public BankBookDTO bankBookDelete() {
		BankBookDTO bankBookDTO = new BankBookDTO();
		System.out.println("삭제할 번호를 입력하세요");
		
		bankBookDTO.setBookNum(sc.nextLong());
		
		return bankBookDTO;
	}
	
	public BankBookDTO bankBookDetail() {
		BankBookDTO bankBookDTO = new BankBookDTO();
		System.out.println("조회할 번호를 입력하세요");
		
		bankBookDTO.setBookNum(sc.nextLong());
		
		return bankBookDTO;
	}
	
	public String bankBookSearch() {
		System.out.println("조회할 이름 입력");
		String ss = sc.next();
		return ss;
	}


}
