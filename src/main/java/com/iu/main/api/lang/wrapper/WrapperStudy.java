package com.iu.main.api.lang.wrapper;

import java.util.Scanner;

import com.iu.main.bankBook.BankBookDTO;

public class WrapperStudy {
	public void s1() {
		String str="청약저축-5.2-1";
		
		String[] strs = str.split("-");
		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
		
		
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName(strs[0]);
		bankBookDTO.setBookRate(Double.parseDouble(strs[1]));
		bankBookDTO.setBookSale(Integer.parseInt(strs[2]));
	}
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요");
		//1. 남녀 구분
		//2. 나이 
		//3. 3~5월 : 봄, 6~8 : 여름, 9~11 : 가을, 12~2 : 겨울
		
		String jumin = sc.nextLine();
		String [] jumins = jumin.split("");
		String mw = jumins[7];
		String age = new String();
		for(int i=0; i<2; i++) {
			age+=jumins[i];
		}
		long ageLong= Long.parseLong(age);

		
		String birth= jumins[2]+jumins[3];
		String[] spring = {"03","04","05"};
		String[] summer = {"06","07","08"};
		String[] autumn = {"09","10","11"};
		String[] winter = {"12","01","02"};
		
		
		if(Long.parseLong(mw)==1 || Long.parseLong(mw)==3) {
			System.out.println("남자입니다.");
			if(Long.parseLong(mw)==1) {
				System.out.println("나이는 : "+(2023-(1900+ageLong))+"입니다.");
			}else {
				System.out.println("나이는 : "+(2023-(2000+ageLong))+"입니다.");
			}
		}else {
			System.out.println("여자입니다.");
			if(Long.parseLong(mw)==2) {
				System.out.println("나이는 : "+(2023-(1900+ageLong))+"입니다.");
			}else {
				System.out.println("나이는 : "+(2023-(2000+ageLong))+"입니다.");
			}
		}
		
		
		for(int i =0; i<3;i++) {
			if(birth.equals(spring[i])) {
				System.out.println("봄에 태어났네");
			}else if(birth.equals(summer[i])) {
				System.out.println("여름에 태어났네");
			}else if(birth.equals(autumn[i])) {
				System.out.println("가을에 태어났네");
			}else if(birth.equals(winter[i])) {
				System.out.println("겨울에 태어났네");
			}
		}
	}
	
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		String jumin = sc.nextLine();
		jumin = jumin.replace("-", "");
		String [] jumins = jumin.split("");
		int verification = Integer.parseInt(jumins[jumins.length-1]);
		System.out.println("검증용 숫자  "+verification);
		int sum=0;
		boolean result=false;
		
		for(int i=0; i<jumins.length-1; i++) {
			if(i<8){
				sum+=Integer.parseInt(jumins[i])*(i+2);
				
			}else if(i>=8) {
				sum+=Integer.parseInt(jumins[i])*(i-6);
				
			}
		}
		System.out.println("총합은 "+sum+" 입니다.");
		int mod = sum%11;
		int ss = 11-mod;
		System.out.println("11로 나눈 나머지는 "+mod+" 입니다.");
		System.out.println("11에서 나머지를 뺀 숫자는 "+ss+" 입니다.");
		if(mod==0 || mod==1) {
			mod = ss%10;
			result = verification==mod;
			System.out.println("2자리 검증 ㄱㄱ");
		}else {
			result = verification==mod;
			System.out.println("1자리 검증 ㄱㄱ");
		}
		System.out.println(result);
	}		
	
}
