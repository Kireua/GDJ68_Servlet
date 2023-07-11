package com.iu.main.api.lang.string;

import java.util.Scanner;

public class StringStudy {

	private Scanner sc;
	
	public StringStudy(){
		 sc = new Scanner(System.in);
	}
	
	public void s1() {
		//문자열
		//length()
		//indexOf()
		//lastIndexOf()
		String str = "Hello World";
		for(int i =0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		int ch = str.indexOf("W"); //int ch(char)
		System.out.println("ch : "+ch);
		
		ch= str.indexOf("H",4);
		System.out.println(ch);
		
		str="iu.winter.suji.jpg";
		ch = str.lastIndexOf(".");
		System.out.println(ch);
	}
	
	
	//split()
	//replace()
	public void s2() { //파싱
		String data="서울 비 대구-눈,광주 맑음-부산,우박-제주-안개";
		//공백, , - 으로 구분 되어있는것을 분리하는방법
		System.out.println(data);
		data = data.replace(" ",",");
		System.out.println(data);
		data = data.replace("-",",");
		System.out.println(data);
		String[] datas = data.split(",");
		for(int i =0; i<datas.length; i++) {
			System.out.println(datas[i]);
		}
	}
	
	//substring(),valueOf()
	public void s3( ) {
		String str = "iu.suji.winter.jpg";
		
		String sb = str.substring(2);
		System.out.println(sb);
		
	    String sb2 = str.substring(2, 5);
	    System.out.println(sb2);
	    
	    //.jpg 확장자중 jpg 만 나오게하기
	    str = str.substring(str.lastIndexOf(".")+1);
	    System.out.println(str);
	    
	    str=String.valueOf(2);
	    
	}
	
	public void ex1() {
		//파일명.확장자 abc.gif
		//확장자가 jpg면 이미지파일 출력
		//확장자가 doc면 문서파일 출력
		//확장자가 mp3면 오디오파일 출력
		//그 외는 알 수 없는 파일 형식입니다.
		String jpg = "jpg";
		String doc = "doc";
		String mp3 = "mp3";
		System.out.println("파일명.확장자를 입력하세요");
		String str = this.sc.next();
		if(jpg.equals(str.substring(str.lastIndexOf(".")+1))) {
			System.out.println("이미지파일입니다.");
		}else if(doc.equals(str.substring(str.lastIndexOf(".")+1))) {
			System.out.println("문서파일입니다.");
		}else if(mp3.equals(str.substring(str.lastIndexOf(".")+1))) {
			System.out.println("오디오파일입니다.");
		}else {
			System.out.println("알수없는 파일 형식 입니다.");
		}
	}
	
	public void ex2() {
		//파일명.확장자 abc.gif
		//확장자가 jpg,jpeg,png,gif면 이미지파일 출력
		//확장자가 doc,txt,hwp면 문서파일 출력
		//확장자가 mp3, wav, midi, pcm면 오디오파일 출력
		//그 외는 알 수 없는 파일 형식입니다.
		
		
		String[] image = {"jpg","jpeg","png","gif"};
		String[] docs = {"doc","txt","hwp"};
		String[] audio = {"mp3","wav","midi","pcm"};
		System.out.println("파일명.확장자를 입력하세요");
		String str = this.sc.next();
		
			for(int i =0; i<image.length; i++) {
				if(image[i].equals(str.substring(str.lastIndexOf(".")+1))) {
					System.out.println("이미지파일입니다.");
					return;
				}	
			}for(int i=0; i<docs.length;i++) {
				if(docs[i].equals(str.substring(str.lastIndexOf(".")+1))) {
					System.out.println("문서파일입니다.");
					return;
				}
			}for(int i=0; i<audio.length; i++) {
				if(audio[i].equals(str.substring(str.lastIndexOf(".")+1))) {
					System.out.println("오디오파일 입니다.");
					return;
				}
			}System.out.println("알 수 없는 파일입니다.");
		
		
		
	}
}
