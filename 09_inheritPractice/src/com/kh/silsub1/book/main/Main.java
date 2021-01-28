package com.kh.silsub1.book.main;

import com.kh.silsub1.book.model.vo.Book;

public class Main {
	
	public static void main(String[] args) {
		
		Book b1 = new Book("양들의 침묵", "토머스 해리스", 13500);
		Book b2 = new Book("동물 농장", "조지 오웰", 13500);
		
		//정보 출력
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		//두 객체의 값이 일치하는지
		System.out.println(b1.equals(b2));
		
		System.out.println();
		
		
		//얕은 복사
		Book b3 = b1;
		System.out.println(b1.hashCode());
		System.out.println(b3.hashCode());//주소 같음
		System.out.println(b1);
		System.out.println(b3);//값 같음
		Book b4 = b2;
		System.out.println(b2.hashCode());
		System.out.println(b4.hashCode());//주소 같음
		System.out.println(b2);
		System.out.println(b4);//값 같음
		
		System.out.println();
		
		
		//깊은 복사
		Book b5 = new Book(b1.getTitle(), b1.getAuthor(), b1.getPrice());
		b1.setAuthor("신경숙");
		System.out.println(b1.hashCode());
		System.out.println(b5.hashCode());//hashcode매소드 때무네 주소 같음
		System.out.println(b1);
		System.out.println(b5);//값 다름
		
		Book b6 = new Book(b2.getTitle(), b2.getAuthor(), b2.getPrice());
		b2.setPrice(10000);
		System.out.println(b2.hashCode());
		System.out.println(b6.hashCode());//hashcode매소드 때무네 주소 같음
		System.out.println(b2);
		System.out.println(b6);//값 다름
		

				
	}

}
