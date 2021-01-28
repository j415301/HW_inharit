package com.kh.silsub1.book.main;

import com.kh.silsub1.book.model.vo.Book;

public class Main {
	
	public static void main(String[] args) {
		
		Book b1 = new Book("����� ħ��", "��ӽ� �ظ���", 13500);
		Book b2 = new Book("���� ����", "���� ����", 13500);
		
		//���� ���
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		//�� ��ü�� ���� ��ġ�ϴ���
		System.out.println(b1.equals(b2));
		
		System.out.println();
		
		
		//���� ����
		Book b3 = b1;
		System.out.println(b1.hashCode());
		System.out.println(b3.hashCode());//�ּ� ����
		System.out.println(b1);
		System.out.println(b3);//�� ����
		Book b4 = b2;
		System.out.println(b2.hashCode());
		System.out.println(b4.hashCode());//�ּ� ����
		System.out.println(b2);
		System.out.println(b4);//�� ����
		
		System.out.println();
		
		
		//���� ����
		Book b5 = new Book(b1.getTitle(), b1.getAuthor(), b1.getPrice());
		b1.setAuthor("�Ű��");
		System.out.println(b1.hashCode());
		System.out.println(b5.hashCode());//hashcode�żҵ� ������ �ּ� ����
		System.out.println(b1);
		System.out.println(b5);//�� �ٸ�
		
		Book b6 = new Book(b2.getTitle(), b2.getAuthor(), b2.getPrice());
		b2.setPrice(10000);
		System.out.println(b2.hashCode());
		System.out.println(b6.hashCode());//hashcode�żҵ� ������ �ּ� ����
		System.out.println(b2);
		System.out.println(b6);//�� �ٸ�
		

				
	}

}
