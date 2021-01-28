package com.kh.silsub1.book.model.vo;

import java.util.Objects;

public class Book {
	
	private String title;
	private String author;
	private int price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return title+" "+author+" "+price;
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj instanceof Book) {
			Book b = (Book)obj;
			if (getTitle().equals(b.getTitle()) && getAuthor().equals(b.getAuthor())
					&& getPrice()==b.getPrice()) {
				//앞에 getTitle() 부분이 equal 앞이 되는 거고 객체 b에 equals 뒷부분 값을 받아오는 것!
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, author, price);
	}

}
