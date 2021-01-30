package com.kh.silsub2.point.model.vo;

public class Rectangle extends Point{
	
	private int width;
	private int height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int x, int y) {
		super(x, y);
		this.width = x;
		this.height = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.printf("면적: %.1f\t", (double)width*height);
		System.out.printf("둘레: %.1f\n", (double)2*(width+height));
	}
}